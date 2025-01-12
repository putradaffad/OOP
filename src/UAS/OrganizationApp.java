package UAS;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class OrganizationApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}

class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/organization_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

class MainFrame extends JFrame {

    private JTextField nameField;
    private JTextField roleField;
    private JTextField departmentField;
    private JButton saveButton;
    private JButton clearButton;
    private JButton refreshButton;
    private JTable dataTable;
    private DefaultTableModel tableModel;

    public MainFrame() {
        setTitle("Organization Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Form components
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel roleLabel = new JLabel("Role:");
        roleField = new JTextField();

        JLabel departmentLabel = new JLabel("Department:");
        departmentField = new JTextField();

        saveButton = new JButton("Save");
        clearButton = new JButton("Clear");

        saveButton.addActionListener(new SaveButtonListener());
        clearButton.addActionListener(new ClearButtonListener());

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(roleLabel);
        formPanel.add(roleField);
        formPanel.add(departmentLabel);
        formPanel.add(departmentField);
        formPanel.add(saveButton);
        formPanel.add(clearButton);

        // Table components
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Role", "Department"}, 0);
        dataTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(dataTable);

        refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> loadData());

        add(formPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(refreshButton, BorderLayout.SOUTH);

        // Load initial data
        loadData();
    }

    private void saveData(String name, String role, String department) {
        String query = "INSERT INTO employees (name, role, department) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, role);
            preparedStatement.setString(3, department);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data saved successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to save data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadData() {
        String query = "SELECT * FROM employees";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            tableModel.setRowCount(0); // Clear existing data

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String role = resultSet.getString("role");
                String department = resultSet.getString("department");

                tableModel.addRow(new Object[]{id, name, role, department});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String role = roleField.getText();
            String department = departmentField.getText();

            if (name.isEmpty() || role.isEmpty() || department.isEmpty()) {
                JOptionPane.showMessageDialog(MainFrame.this, "All fields must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            saveData(name, role, department);
            loadData();

            nameField.setText("");
            roleField.setText("");
            departmentField.setText("");
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            nameField.setText("");
            roleField.setText("");
            departmentField.setText("");
        }
    }
}
