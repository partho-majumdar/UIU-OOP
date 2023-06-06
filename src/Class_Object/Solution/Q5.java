package Class_Object.Solution;

public class Q5 {
    public static void main(String[] args) {
        Trianglee tri = new Trianglee(3, 4, 5);
        double perimeter = tri.perimeter();
        double area = tri.area();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Trianglee {
    float a, b, c;

    Trianglee(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        return a + b + c;
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

/*
Write a program to print the area and perimeter
of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with constructor
having the three sides as its parameters.
 */