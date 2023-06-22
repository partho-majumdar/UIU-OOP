package Lab03.Solution;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int len = arr.length;

        int k = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        while (k < len) {
            arr[k] = 0;
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
