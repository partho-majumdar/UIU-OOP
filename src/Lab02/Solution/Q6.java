package Lab02.Solution;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = input.nextFloat();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        input.close();
    }
}