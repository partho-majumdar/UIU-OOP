package Lab09.Solution;

public abstract class Shape {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void RectangleArea(double length, double width);

    public abstract void SquareArea(double side);

    public abstract void CircleArea(double radius);
}
