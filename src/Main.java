//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(0, 0), 5);
        Shape rectangle = new Rectangle(new Point(1, 1), 3, 4);
        Shape square = new Square(new Point(2, 2), 3);

        System.out.println("Tổng số hình là:" + Shape.count);
        circle.getAllShape();
    }
}