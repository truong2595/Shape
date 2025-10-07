public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
        count ++;
        this.addShape(this);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    //public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle[centerPoint=(" + getCenterPoint().getX() + "," + getCenterPoint().getY() + "), width=" + width + ", height=" + height + "]";
    }
}
