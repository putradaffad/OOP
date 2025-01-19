package praktikum.Pert11.StatisVariableMethods;

public class MyVarTester {
    public static void main(String[] args) {
        // Menggunakan static variable
        MyVar.myStatic = 100; // Static variable diakses langsung oleh kelas
        System.out.println("Static Variable (myStatic): " + MyVar.myStatic);

        // Membuat objek untuk instance variable
        MyVar obj1 = new MyVar();
        MyVar obj2 = new MyVar();

        // Mengatur instance variable untuk obj1 dan obj2
        obj1.myInstance = 10;
        obj2.myInstance = 20;

        System.out.println("Instance Variable obj1 (myInstance): " + obj1.myInstance);
        System.out.println("Instance Variable obj2 (myInstance): " + obj2.myInstance);

        // Mengakses local variable dalam metode test()
        obj1.test();
        System.out.println("Instance Variable obj1 (myInstance) setelah test(): " + obj1.myInstance);
    }
}