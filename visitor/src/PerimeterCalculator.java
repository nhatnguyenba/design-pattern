public class PerimeterCalculator implements ShapeVisitor {
    private double perimeter = 0;

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void visit(Circle circle) {
        perimeter += 2 * Math.PI * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        perimeter += 2 * (rectangle.getLength() + rectangle.getWidth());
    }

    @Override
    public void visit(Triangle triangle) {
        perimeter += triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
    }
}