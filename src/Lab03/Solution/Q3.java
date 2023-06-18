package Lab03.Solution;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.printf("Enter %d scores: ", n);
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int best = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] > best) {
                best = arr[j];
            }
        }

        for (int k = 0; k < n; k++) {
            if (arr[k] >= best - 10) {
                System.out.println("Student " + k + " score is " + arr[k] + " and grade is A");
            } else if (arr[k] >= best - 20) {
                System.out.println("Student " + k + " score is " + arr[k] + " and grade is B");
            } else if (arr[k] >= best - 30) {
                System.out.println("Student " + k + " score is " + arr[k] + " and grade is C");
            } else if (arr[k] >= best - 40) {
                System.out.println("Student " + k + " score is " + arr[k] + " and grade is D");
            }
        }
        input.close();
    }
}
