package Class_Object.Solution;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        Average avg = new Average();
        avg.calculate(n1, n2, n3);

        input.close();
    }
}

class Average {
    void calculate(double num1, double num2, double num3) {
        double ans = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + ans);
    }
}

/*
 * Print the average of three numbers entered by user by creating
 * a class named 'Average' having a method to calculate and print the average.
 */