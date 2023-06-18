package Class_Object.Solution;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Area rectangle = new Area();

        System.out.print("Enter length: ");
        double len = input.nextDouble();

        System.out.print("Enter breadth: ");
        double bre = input.nextDouble();

        rectangle.setDim(len, bre);

        double area = rectangle.getArea();

        System.out.println("Area: " + area);

        input.close();

    }
}

class Area {
    double length;
    double breadth;

    void setDim(double len, double bre) {
        this.length = len;
        this.breadth = bre;
    }

    double getArea() {
        return length * breadth;
    }
}

/*
 * Write a program to print the area of a rectangle by creating a class named
 * 'Area' having two methods. First method named as 'setDim' takes length and
 * breadth of rectangle as parameters and the second method named as 'getArea'
 * returns the area of the rectangle. Length and breadth of rectangle are
 * entered through keyboard.
 */