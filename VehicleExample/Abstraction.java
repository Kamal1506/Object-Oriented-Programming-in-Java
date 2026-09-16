// Abstraction means hiding implementation details and showing only essential functionality. 
// In Java, we achieve abstraction using abstract classes and interfaces. Here, Vehicle declares the drive() method, while Tesla provides its implementation.

abstract class Vehicle {
    private String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    // Abstract method
    public abstract void drive();
}
class Tesla extends Vehicle {
    Tesla(String brand) {
        super(brand);
    }
    @Override
    public void drive() {
        System.out.println("Driving " + getBrand());
    }
}
public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla Model 3");
        tesla.drive();
    }
}
