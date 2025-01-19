package praktikum.Pert11.FinalClassMyMath;

public final class MyMath {
    public static final double PI = 3.1416; // empat digit pecahan

    public static double luasLingkaran(double radius) {
        return PI * radius * radius;
    }

    public static double kelilingLingkaran(double radius) {
        return 2 * PI * radius;
    }

    public static double sin(double derajat) {
        return Math.sin(Math.toRadians(derajat));
    }

    public static double cos(double derajat) {
        return Math.cos(Math.toRadians(derajat));
    }

    public static double tan(double derajat) {
        return Math.tan(Math.toRadians(derajat));
    }

    public static double pangkat(double x, double y) {
        return Math.pow(x, y);
    }
}