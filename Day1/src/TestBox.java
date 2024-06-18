public class TestBox {
  public static void main(String[] args) {
    Box box1, box2;

    box1 = new Box(10, 20, 30);
    box2 = new Box(10, 20, 30);

    System.out.println("Volume: " + box1.computeVolume());
    System.out.println("Volume: " + box2.computeVolume());
  }
}
