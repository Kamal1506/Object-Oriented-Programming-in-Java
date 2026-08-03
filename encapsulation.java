/*Encapsulation is the practice of keeping an object's data (fields)
private, and exposing controlled access to that data only through
public methods (commonly called getters and setters), which can
enforce validation rules, logging, or other logic at the point of access.*/


class BankAccount {
 private double balance; // hidden — no outside code 
 public double getBalance() { // getter — con 
   return balance;
 }
 public void deposit(double amount) { // controlled W 
   if (amount <= 0) {
   System.out.println("Deposit must be positive! ")
   return;
   }
   balance += amount;
 }
 public void withdraw(double amount) {
   if (amount > balance) {
     System.out.println("Insufficient funds!");
     return;
   }
   balance -= amount;
 }
}

BankAccount acc = new BankAccount();
acc.deposit(1000);
acc.withdraw(200);
System.out.println(acc.getBalance()); // 800
// acc.balance = -5000; 
