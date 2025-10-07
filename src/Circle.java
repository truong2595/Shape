public class Circle extends Shape{
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
        count ++;
        this.addShape(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[centerPoint=(" + getCenterPoint().getX() + "," + getCenterPoint().getY() + "), radius=" + radius + "]";
    }
}
