public class Rec {
  double width;
  double height;
  String name;

  Rec() {
    this.width = 1.0;
  }

  Rec(double w) {
    this.width = w;
  }

  double computeArea() {
    double area;
    area = this.width * this.height;
    return area;
  }

}
