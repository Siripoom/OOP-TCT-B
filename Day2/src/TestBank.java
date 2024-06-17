public class TestBank {
  public static void main(String[] args) {
    text();
    textShow("Siripoom");
    pi(3.0);
  }

  public static void text() { // ! on return and no parameter
    System.out.println("Hello");
  }

  public static void textShow(String name) { // ! on return and with parameter
    System.out.println("Hello" + name);
  }

  public static String textShowAge() { // ! with return and no parameter
    return "Poom";
  }

  public static Double pi(double r) { // ! with return and with parameter
    return 3.14 * (r * r);
  }

}
