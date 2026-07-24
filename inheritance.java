// Inheritance is an OOP mechanism in which one class acquires the properties and behaviors of another class using the extends keyword. 
// It promotes code reusability and establishes an IS-A relationship.

// Notice the important words:

// acquires
// code reusability
// IS-A relationship

// Those are the keywords interviewers love to hear.
    
class Animal{
    String name;
    
    Animal(String name){
        this.name = name;
    }
    
    void eat(){
        System.out.println(name+" is eating");
    }
}

class Dog extends Animal{
    
    Dog(String name){
        super(name);
    }
    
    void bark(){
        System.out.println(name+" is barking..");
    }
}

class Main{
    public static void main(String args[]){
        Dog d = new Dog("viswa");
        d.eat();
        d.bark();
    }
}
