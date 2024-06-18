public class TestRect {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(); // Create an object with special method
    rect.setWidth(100);
    rect.setHeight(50);
    rect.name = "Rect 1";

    System.out.println("Object name: " + rect.name);
    System.out.println("W = " + rect.getWidth() + " – H = " + rect.getHeight());
    System.out.println("Area = " + rect.computeArea());
  }

}
