package praktikum.Pert9.LatihanSoalCase;

// Interface Engine
interface Engine {
    void startEngine();
    void stopEngine();
}

// Abstract class Vehicle
abstract class Vehicle {
    String model;
    String color;
    int year;
    
    // Constructor
    public Vehicle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Abstract method move
    public abstract void move();
}

// Class Car implements Engine and extends Vehicle
class Car extends Vehicle implements Engine {
    public Car(String model, String color, int year) {
        super(model, color, year);
    }

    // Implementing startEngine from Engine
    @Override
    public void startEngine() {
        System.out.println("Mobil mulai menyala");
    }

    // Implementing stopEngine from Engine
    @Override
    public void stopEngine() {
        System.out.println("Mobil mati");
    }

    // Implementing move from Vehicle
    @Override
    public void move() {
        System.out.println("Mobil bergerak");
    }
}

// Class Motorcycle implements Engine and extends Vehicle
class Motorcycle extends Vehicle implements Engine {
    public Motorcycle(String model, String color, int year) {
        super(model, color, year);
    }

    // Implementing startEngine from Engine
    @Override
    public void startEngine() {
        System.out.println("Motor mulai menyala");
    }

    // Implementing stopEngine from Engine
    @Override
    public void stopEngine() {
        System.out.println("Motor mati");
    }

    // Implementing move from Vehicle
    @Override
    public void move() {
        System.out.println("Motor bergerak");
    }
}

// Main class to test the program
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Merah", 2023);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Hitam", 2022);

        // Testing Car
        car.startEngine();
        car.move();
        car.stopEngine();

        // Testing Motorcycle
        motorcycle.startEngine();
        motorcycle.move();
        motorcycle.stopEngine();
    }
}
