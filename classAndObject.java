class Car{
    String brand;
    String color;
    
    void start(){
        System.out.println(brand+" is starting...");
    }
    void stop(){
        System.out.println(brand+" stopped.");
    }
}


public class Main{
    public static void main(String args[]){
        Car audi = new Car();
        audi.brand = "AUDI";
        audi.color = "red";
        System.out.println(audi.brand);
        System.out.println(audi.color);
        audi.start();
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.color = "blue";
        bmw.start();
        bmw.stop();
    }
}
