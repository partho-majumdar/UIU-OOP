package Lab03.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of element in array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

        input.close();
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[-1];
    }
}
