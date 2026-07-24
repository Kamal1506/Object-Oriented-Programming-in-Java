// Polymorphism is the ability of a single interface or reference type to represent objects of different classes, 
// allowing the same method call to exhibit different behaviors based on the actual object at runtime.


class Person{
    void role(){
        System.out.println("Kamal");
    }
}

class Son extends Person{
    @Override
    void role(){
        System.out.println("Son");
    }
}

class Student extends Person{
    @Override
    void role(){
        System.out.println("Student");
    }
}

class Candidate extends Person{
    @Override
    void role(){
        System.out.println("Candidate");
    }
}

public class Main{
    public static void main(String[] args){
        Person a = new Son();
        a.role();
        a = new Candidate();
        a.role();
    }
}
