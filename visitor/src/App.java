import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Triangle(3, 4, 5));

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
        System.out.println("Total area: " + areaCalculator.getArea());
    }
}
