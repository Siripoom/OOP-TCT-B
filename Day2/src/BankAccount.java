public class BankAccount {
  private String id;
  private String name;
  private double balance;

  BankAccount() {
    this.id = "0123";
    this.name = "Mr.Sumlee";
    this.balance = 300.0;
  }

  BankAccount(String id, String name, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance = this.balance - amount;
  }

  public double checkBalance() {
    return this.balance;
  }

  public void display() {
    System.out.println("Id: " + this.id);
    System.out.println("Name: " + this.name);
    System.out.println("Balance: " + this.balance);
    System.out.println("==================================");
  }

}
