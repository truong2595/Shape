import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private Point centerPoint;
    public static int count = 0;
    private static List<Shape> listShape = new ArrayList<>();

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public void addShape(Shape shape) {
        listShape.add(shape);
    }

    public void getAllShape() {
        for (Shape shape : listShape) {
            System.out.println(shape.toString());
        }
    }

    //public abstract String toString();
}
