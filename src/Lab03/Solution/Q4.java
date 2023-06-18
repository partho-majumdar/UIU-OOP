package Lab03.Solution;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        int[] occurrences = new int[101];
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter number form 1-100: ");
            number = input.nextInt();

            if (number >= 1 && number <= 100) {
                occurrences[number]++;
            }
        } while (number != 0);

        for (int i = 1; i <= 100; i++) {
            if (occurrences[i] > 0) {
                System.out.printf("%d occur %d times\n", i, occurrences[i]);
            }
        }
        input.close();
    }
}
