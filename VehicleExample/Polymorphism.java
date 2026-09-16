// Polymorphism means one entity can take multiple forms. In Java, runtime polymorphism is achieved through method overriding.
// For example, a Vehicle reference can point to Tesla or BMW objects, and the appropriate overridden drive() method is selected at runtime.

class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}
class Tesla extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Tesla is driving");
    }
}
class BMW extends Vehicle 
    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle = new Tesla();
        vehicle.drive();
        vehicle = new BMW();
        vehicle.drive();
    }
}
