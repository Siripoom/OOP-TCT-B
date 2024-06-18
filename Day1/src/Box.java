public class Box {
  private double depth;

  public void setDepth(double d) {
    if (d == 0)
      this.depth = 1.0;
    else
      this.depth = d * -1;
  }

  public double getDepth() {
    return this.depth;
  }
}
