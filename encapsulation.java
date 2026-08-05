/*Encapsulation is the practice of keeping an object's data (fields)
private, and exposing controlled access to that data only through
public methods (commonly called getters and setters), which can
enforce validation rules, logging, or other logic at the point of access.*/

class BankAccount{
	private String name;
	private double balance;

	BankAccount(String name, double initialAmount){
		this.name = name;
		if(initialAmount > 0){
			this.balance = initialAmount;
		}
	}
	public String getName(){
		return name;
	}
	public int getBalance(){
		return (int)balance;
	}
	public void deposit(double amount){
		if(amount > 0){
			balance += amount;
		}
	}
}

class Main{
	public static void main(String args[]){
		BankAccount acc = new BankAccount("Kamal", 50000.80);
		System.out.println(acc.getName());
		acc.deposit(30000);
		System.out.println(acc.getBalance());
		// System.out.println(acc.balance);
	}
}
