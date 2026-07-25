// An interface in Java is a reference type that acts as a formal contract or blueprint specifying what a class must do, but not how it does it. 
// It is declared using the interface keyword and serves as a collection of abstract methods and static constants to achieve total abstraction, 
// loose coupling, and multiple inheritance in Java programs

// Abstract Class
// Defines what an object is.
// Example:
// Dog IS-A Animal

// Interface
// Defines what an object can do.
// Example:
// Duck CAN Swim
// Duck CAN Fly
// Duck CAN Hunt

// Notice the difference?
// Abstract class → Identity.
// Interface → Capability.

// We use the implements keyword because a class implements the contract defined by an interface. 
// An interface specifies what must be done, and the implementing class provides how it is done.

// If an interviewer asks:

// When would you choose an abstract class over an interface?

// A concise, strong answer is:

// "I use an abstract class when related classes share common state and partial implementation. 
// I use an interface when I want to define a capability or contract that unrelated classes can implement."

interface Swimmer{
    void swim();
}

class Fish implements Swimmer{
    @Override
    public void swim(){
        System.out.println("Fish is swimming...");
    }
}

class Main{
    public static void main(String args[]){
        Swimmer s = new Fish();
        s.swim();
    }
}
