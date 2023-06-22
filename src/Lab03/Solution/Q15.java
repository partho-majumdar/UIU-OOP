package Lab03.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter k steps: ");
        int k = input.nextInt();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length;

        revArr(arr, 0, len - 1);
        revArr(arr, 0, k - 1);
        revArr(arr, k, len - 1);
        System.out.println(Arrays.toString(arr));
        input.close();
    }

    static void revArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
