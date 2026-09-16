// Concept : Encapsulation means wrapping data and methods together in a class and restricting direct access to the data.
// We normally achieve it using:
// private variables
// public getter/setter methods

class Vehicle {
    // Data is hidden
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
    // Controlled access
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Tesla");
        System.out.println(vehicle.getBrand());
        vehicle.setBrand("Tesla Model 3");
        System.out.println(vehicle.getBrand());
    }
}
