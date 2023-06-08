package Class_Object.Solution;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = input.nextDouble();

        System.out.print("Enter breadth: ");
        double b = input.nextDouble();

        Areaa aa = new Areaa(l, b);

        double ans = aa.returnArea();

        System.out.println("Area: " + ans);
    }
}

class Areaa {
    double length;
    double breadth;

    Areaa(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    double returnArea() {
        return length * breadth;
    }
}

/*
Write a program to print the area of a rectangle by creating
a class named 'Area' taking the values of its length and breadth
as parameters of its constructor and having a method named 'returnArea'
which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/
