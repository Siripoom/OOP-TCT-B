public class TestClass {
  private int num = 0; // * property */

  TestClass() { // * default Constructor */
    this.num = 1;
  }

  TestClass(int x) { // * Overloading Constructor */
    this.num = x;
  }

  public void setNum(int x) {
    this.num = x;
  }

  public int getNum() {
    return this.num;
  }

}
