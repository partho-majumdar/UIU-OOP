package Class_Object.Solution;

public class Q6 {
    public static void main(String[] args) {
        Triangleee t1 = new Triangleee(4, 5);
        Triangleee t2 = new Triangleee(5, 8);

        System.out.println("Perimeter1: " + t1.perimeter1() + ", Area1: " + t1.area1());
        System.out.println("Perimeter2: " + t2.perimeter1() + ", Area2: " + t2.area1());
    }
}

class Triangleee {
    float length, breadth;

    Triangleee(float l, float b) {
        this.length = l;
        this.breadth = b;
    }

    double perimeter1() {
        return 2 * (length * breadth);
    }

    double area1() {
        return length + breadth;
    }
}

/*
 * Write a program to print the area of two rectangles having
 * sides (4,5) and (5,8) respectively by creating a class named
 * 'Rectangle' with a method named 'Area' which returns the area
 * and length and breadth passed as parameters to its constructor.
 */