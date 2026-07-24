// A constructor is a special method that is automatically called when an object is created. It is used to initialize the object's state.

// A constructor is a special member of a class used to initialize objects. It resembles a method syntactically but is not considered a method in Java.

// There are three key points here:

// It is automatically called.
// It runs once per object creation.
// Its main purpose is initialization.

// A constructor is used to initialize an object when it is created. It assigns meaningful initial values to the object's fields so the object is ready to use immediately

// Notice the difference:

// Java gives default values.
// Constructor gives meaningful values.


class Employee{
    String name;
    int id;
    
    Employee(){
        name = "Unknown";
        id = 0;
    }
    
    Employee(int id){
        this.id = id;
    }
    
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public void Employee(){
        System.out.print("Hi");
    }
}

class Main{
    public static void main(String args[]){
        Employee e = new Employee(72);
        System.out.print(e.id);
    }
}
