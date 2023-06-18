package Lab03.Solution;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int positive_count = 0;
        int negative_count = 0;
        int total = 0;
        int count_number = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integer: ");

        for (int i = 1; i <= 10; i++) {
            int value = input.nextInt();

            if (value == 0) {
                break;
            }
            if (value > 0) {
                positive_count++;
            } else {
                negative_count++;
            }

            total += value;
            count_number++;
        }

        float average = (float) total / count_number;
        System.out.println("Positive: " + positive_count + ", Negative: " + negative_count);
        System.out.println("Average: " + average);

        input.close();
    }
}
