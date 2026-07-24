// An abstract class is a class that cannot be instantiated and may contain both abstract methods (without implementation) and concrete methods (with implementation). 
// It is used to provide a common base while forcing subclasses to implement specific behavior.

// An abstract class contains one or more abstract methods that have no implementation. 
// If Java allowed creating an object of an abstract class, calling an abstract method would have no implementation to execute. 
// Therefore, Java prevents instantiation of abstract classes at compile time.
  
abstract class Car {

    abstract void startEngine();

    void drive() {
        System.out.println("Car is moving");
    }
}

class BMW extends Car {

    @Override
    void startEngine() {
        System.out.println("BMW Engine Started");
    }
}

class Tesla extends Car {

    @Override
    void startEngine() {
        System.out.println("Tesla Ready to Drive");
    }
}

class Main{
    public static void main(String args[]){
        Car c = new BMW();
        c.startEngine();
        c.drive();
    }
}
