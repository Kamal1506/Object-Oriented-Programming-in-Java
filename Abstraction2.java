abstract class Vehicle{
	private String brand;
	Vehicle(String brand){
		this.brand = brand;
	}
	public void startEngine(){
		System.out.println("Engine Started");
	}
	public abstract void drive();
}
interface Autonomous{
	void selfDrive();
}
interface Electric{
	void chargeBattery();
}
class Tesla extends Vehicle implements Autonomous, Electric{
	public Tesla(String brand){
		super(brand);
	}
	@Override
	public void drive(){
		System.out.println("Driving...");
	}
	@Override
	public void selfDrive(){
		System.out.println("Autopilot enabled..");
	}
	@Override
	public void chargeBattery(){
		System.out.println("Charging..");
	}
}

class Main{
	public static void main(String args[]){
		Tesla myTesla = new Tesla("Tesla Model 3");
		//abstract class methods
		myTesla.startEngine();
		myTesla.drive();

		//interface methods
		myTesla.selfDrive();
		myTesla.chargeBattery();
	}
}
