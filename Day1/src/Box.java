public class Box extends Rectangle {
  private double depth;

  public Box() {
    super();
    this.depth = 1.0;
  }

  public Box(double w, double h, double d) {
    super(w, h);
    this.depth = d;
  }

  public void setSize(double w, double h, double d) {
    if (w == 0 && h == 0 && d == 0) {
      super.setSize(1.0, 1.0);
      this.depth = 1.0;
    } else if (w >= 0 && h >= 0 && d >= 0) {
      super.setSize(w, h);
      this.depth = d;
    } else {
      super.setSize(w * -1, h * -1);
      this.depth = Math.abs(d);
    }
  }

  public void setDepth(double d) {
    if (d == 0)
      this.depth = 1.0;
    else
      this.depth = d * -1;
  }

  public double getDepth() {
    return this.depth;
  }

  public double computeVolume() {
    return super.computeArea() * this.depth;
  }
}
