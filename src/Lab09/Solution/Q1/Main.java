package Lab09.Solution.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Shape> mainObj = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Calculate Rectangle Area\n2. Calculate Square Area\n3. Calculate Circle Area\n0. Exit");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Calculate rectangle area");
            Shape obj1 = new Area();
            System.out.println("Enter length: ");
            double length = input.nextDouble();
            System.out.println("Enter width: ");
            double width = input.nextDouble();
            obj1.RectangleArea(length, width);
            mainObj.add(obj1);

        } else if (choice == 2) {
            System.out.println("Calculate square area");
            Shape obj2 = new Area();
            System.out.println("Enter value of side: ");
            double side = input.nextDouble();
            obj2.SquareArea(side);
            mainObj.add(obj2);

        } else if (choice == 3) {
            System.out.println("Calculate circle area");
            Shape obj3 = new Area();
            System.out.println("Enter radius: ");
            double radius = input.nextDouble();
            obj3.CircleArea(radius);
            mainObj.add(obj3);
        }
        for (Shape s : mainObj) {
            System.out.println("Area: " + s.getArea());
        }
    }
}
