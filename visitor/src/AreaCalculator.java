public class AreaCalculator implements ShapeVisitor {
    private double area = 0;

    public double getArea() {
        return area;
    }

    @Override
    public void visit(Circle circle) {
        area += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        area += rectangle.getLength() * rectangle.getWidth();
    }

    @Override
    public void visit(Triangle triangle) {
        var s = (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()) / 2;
        area = Math.sqrt(s * (s - triangle.getSide1()) * (s - triangle.getSide2()) * (s - triangle.getSide3()));
    }
}