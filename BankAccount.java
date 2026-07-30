abstract class BankAccount{
  //encapsulation
  private String accountHolder;
  private double balance;

  //constructor
  BankAccount(String accountHolder, double balance){
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  //getters
  public String getAccountHolder(){
    return accountHolder;
  }
  public double getBalance(){
    return balance;
  }
  
  //setters
  public void setBalance(double balance){
    this.balance = balance;
  }

  //concrete method
  public void deposit(double amount){
    balance += amount;
    System.out.println(amount+" Deposited Successfully");
  }

  //abstract 
  abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{
  SavingsAccount(String accountHolder, double balance){
    super(accountHolder, balance);
  }

  //run-time polymorphism
  @Override
  public void withdraw(double withdraw){
    if(withdraw <= getBalance()){
      setBalance(getBalance() - withdraw);
      System.out.println(withdraw+" withdrawn successfully");
    }
    else{
      System.out.println("Insufficient Balance..");
    }
  }

  public void displayAccount(){
    System.out.println("Account holder Name : "+getAccountHolder());
    System.out.println("Account Balance : "+getBalance());
  }
} 

class Main{
  public static void main(String args[]){
    //Upcasting
    BankAccount account = new SavingsAccount("Kamal", 10000);
    System.out.println(account.getBalance());
    account.deposit(5000);
    System.out.println(account.getBalance());
    account.setBalance(2000);
    System.out.println(account.getBalance());

    //Downcasting
    SavingsAccount s = (SavingsAccount) account;
    s.displayAccount();
  }
}


