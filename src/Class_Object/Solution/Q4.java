package Class_Object.Solution;

public class Q4 {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.a = 3;
        tri.b = 4;
        tri.c = 5;

        System.out.println("Area: " + tri.getArea());
        System.out.println("Perimeter: " + tri.getPerimeter());
    }
}

class Triangle {
    float a, b, c;

    double getPerimeter() {
        return (a + b + c);
    }

    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
/*
Write a program to print the area and perimeter of a
triangle having sides of 3, 4 and 5 units by creating a class
named 'Triangle' without any parameter in its constructor.
 */
