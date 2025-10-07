public class Square extends Shape {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint);
        this.side = side;
        count ++;
        this.addShape(this);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[centerPoint=(" + getCenterPoint().getX() + "," + getCenterPoint().getY() + "), side=" + side + "]";
    }
}
