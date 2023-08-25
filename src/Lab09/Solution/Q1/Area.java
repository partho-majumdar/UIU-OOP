package Lab09.Solution.Q1;

public class Area extends Shape {

    @Override
    public void RectangleArea(double length, double width) {
        super.setArea(length * width);
    }

    @Override
    public void SquareArea(double side) {
        super.setArea(side * side);
    }

    @Override
    public void CircleArea(double radius) {
        super.setArea(Math.PI * radius * radius);
    }
}
