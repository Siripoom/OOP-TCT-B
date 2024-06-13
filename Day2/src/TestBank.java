public class TestBank {
  public static void main(String[] args) {

    BankAccount obj1 = new BankAccount();
    BankAccount obj2 = new BankAccount("0121", "Ms.Somsee", 50000.0);

    obj1.setName("Mr.SomChai");
    obj1.display();
    obj2.display();

  }
}
