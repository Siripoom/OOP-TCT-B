public class Rectangle {
    private double width;
    private double height;
    String name;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.name = "Rectangle";
    }

    public Rectangle(double width, double height) {
        this.setSize(width, height);
        this.name = "This is Rectangle";
    }

    public void setWidth(double width) {
        if (width == 0)
            this.width = 1.0;
        else
            this.width = Math.abs(width); // width is always positive
    }

    public void setHeight(double height) {
        if (height == 0)
            this.height = 1.0;
        else
            this.height = Math.abs(height); // height is always positive
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setSize(double w, double h) {
        if (w == 0 && h == 0) {
            this.width = 1.0;
            this.height = 1.0;
        } else if (w >= 0 && h >= 0) {
            this.width = w;
            this.height = h;
        } else {
            this.width = Math.abs(w);
            this.height = Math.abs(h);
        }
    }

    public double computeArea() {
        return this.width * this.height;
    }
}
