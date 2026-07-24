// Constructor chaining is the process of calling one constructor from another constructor of the same class using this(). It helps avoid code duplication and improves code reusability.

//   Rule #1 (Very Important)

// this() must be the first statement inside a constructor.

//   Rule #2

// You can call only one constructor using this().

//   Rule #3

// this() is only for constructors.

// It cannot be used inside a normal method.

  
class College{
    String name;
    int rollNo;
    String department;
    int CGPA;
    
    College(String name, int rollNo, String department){
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
    
    College(String name, int rollNo, String department, int CGPA){
        this(name, rollNo, department);
        this.CGPA = CGPA;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(CGPA);
        System.out.println(department);
        System.out.println();
    }
}

class Main{
    public static void main(String args[]){
        College stud1 = new College("kamal", 72, "CSE");
        College stud2 = new College("Jeeva", 73, "CSE", 80);
        System.out.println(stud2.name);
        stud1.display();
        stud2.display();
    }
}

// OP:

