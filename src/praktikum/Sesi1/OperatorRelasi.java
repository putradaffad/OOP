package praktikum.Sesi1;

public class OperatorRelasi {
    public static void main(String[] args) {
        int i = 37;
    int j = 42;
    int k = 42;
    System.out.println("Variable values...");
    System.out.println(" i = " + i);
    System.out.println(" j = " + j);
    System.out.println(" k = " + k);

    System.out.println("Greater than...");
    System.out.println("i > j = " + (i > j)); //false
    System.out.println("j > i = " + (j > i)); //false
    System.out.println("k > j = " + (k > j)); //false
    
    System.out.println("Greater than or equal to...");
    System.out.println("i >= j = " + (i >= j));
    System.out.println("j >= i = " + (j >= i));
    System.out.println("k >= j = " + (k >= j));
    }
}
