// Inheritance is the mechanism by which a child class acquires properties and behaviors from a parent class. 
// In Java, we use the extends keyword for class inheritance. Here, Tesla extends Vehicle and inherits the startEngine() method.

class Vehicle {
    private String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void startEngine() {
        System.out.println("Engine Started");
    }
}
// Tesla inherits Vehicle
class Tesla extends Vehicle {
    Tesla(String brand) {
        super(brand);
    }
    public void drive() {
        System.out.println("Driving " + getBrand());
    }
}
public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla Model 3");
        // Inherited from Vehicle
        tesla.startEngine();
        // Tesla's own method
        tesla.drive();
    }
}
