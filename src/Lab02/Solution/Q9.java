package Lab02.Solution;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = ((float) (9 / 5) * celsius) + 32;
        System.out.println("Value in fahrenheit: " + fahrenheit);
    }
}
