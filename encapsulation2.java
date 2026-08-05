// Encapsulation is an OOP principle that bundles data(variables) and methods into a single unit, known as class

// Core Components of Encapsulation
// Data Hiding:
// Declaring class fields/variables as private so they cannot be accessed or modified directly from outside the class.
// Controlled Access:
// Providing public getter and setter methods to read and modify the private variables safely.

class College {
    // 1. Keep fields private (Data Hiding)
    private String name;
    private String umisNo; // Follow camelCase naming conventions

    public College(String name, String umisNo) {
        this.name = name;
        this.umisNo = umisNo;
    }

    // 2. Provide public getters for controlled read access
    public String getName() {
        return name;
    }

    public String getUmisNo() {
        return umisNo;
    }

    // 3. Provide public setters if modification is allowed
    public void setName(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        College c = new College("Kamal", "12345");

        // Direct field access is blocked (e.g., c.umisNo = "123" will fail)
        
        // Accessing data safely through getters/setters
        c.setName("Kavin");
        System.out.println("College Name: " + c.getName());
        System.out.println("UMIS No: " + c.getUmisNo());
    }
}
