public class TestReg {
  public static void main(String[] args) {
    Rec rect = new Rec(400);
    // rect.width = 100;
    rect.height = 50;
    rect.name = "Rect 1";

    System.out.println("W = " + rect.width);
    // System.out.println("W = " + rect.width + " – H = " + rect.height);
    // System.out.println("Name = " + rect.name);
    // System.out.println("Area = " + rect.computeArea());
  }
}
