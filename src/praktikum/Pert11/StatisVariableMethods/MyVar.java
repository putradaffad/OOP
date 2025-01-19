package praktikum.Pert11.StatisVariableMethods;

public class MyVar {
    public static int myStatic; // Static Variable
    public int myInstance;     // Instance Variable
    

    public void test() {
        int i; // Local Variable
        i = 0;
        for (int j = 1; j <= 10; j++) { // Local Variable
            i += 2;
        }
        myInstance = i; // Accessing instance variable
    }
}