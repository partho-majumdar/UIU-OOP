package Lab02.Solution;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("False");
        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("True");
        }

        input.close();
    }
}
