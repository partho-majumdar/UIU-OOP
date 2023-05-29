package Lab02.Solution;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter center(p, q) value of p: ");
//        float p = input.nextFloat();
//
//        System.out.print("Enter center(p, q) value of q: ");
//        float q = input.nextFloat();

        float p = 0;
        float q = 0;

        System.out.print("Enter value of radius: ");
        float radius = input.nextFloat();

        System.out.print("Enter point(x, y) value of x: ");
        float x = input.nextFloat();

        System.out.print("Enter point(x, y) value of y: ");
        float y = input.nextFloat();

        double value_of_x = Math.pow((x - p), 2);
        double value_of_y = Math.pow((y - q), 2);

        double distance = Math.sqrt(value_of_x + value_of_y);

        if (distance > radius) {
            System.out.println("Point is outside the circle");
        } else if (distance < radius) {
            System.out.println("Point is inside the circle");
        } else if (distance == radius) {
            System.out.println("Point is in the circle");
        }
    }
}
