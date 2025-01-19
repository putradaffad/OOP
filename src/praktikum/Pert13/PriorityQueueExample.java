package praktikum.Pert13;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority); // Urutkan berdasarkan prioritas
    }

    @Override
    public String toString() {
        return "Task(name='" + name + "', priority=" + priority + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Menambahkan tugas ke dalam antrean
        taskQueue.add(new Task("Write report", 3));
        taskQueue.add(new Task("Fix bugs", 1));
        taskQueue.add(new Task("Prepare presentation", 2));

        // Menampilkan dan memproses tugas berdasarkan prioritas
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.poll());
        }
    }
}