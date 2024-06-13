public class TestRect {
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(); // Default Constructor
    Rectangle rect2 = new Rectangle(10.0, 20.0); // Overlading Constructor
    Rectangle rect3 = new Rectangle(20.0, 40.0, "Rect3"); // Overlading
    // Constructor

    rect1.setWidth(50);
    rect1.setHeight(50);
    rect1.name = "Rect TCT34"; // property no private

    rect2.name = "Rect2";
    rect2 = rect1;
    rect1.displayDetail();
    rect2.displayDetail();
    rect3.displayDetail();
  }
}
