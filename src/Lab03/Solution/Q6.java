package Lab03.Solution;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        System.out.print("Enter 10 element: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();

            if (isDistinct(arr, count, num)) {
                arr[count] = num;
                count++;
            }
        }

        System.out.print("Distinct numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static boolean isDistinct(int[] arr2, int count, int num) {
        for (int i = 0; i < count; i++) {
            if (arr2[i] == num) {
                return false;
            }
        }
        return true;
    }
}

/*
---------------- Rule 02 -------------

 static void removeDuplicate(int[] arr, int len) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < len - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    len--;
                    j--;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
            count++;
        }
        System.out.println();
        System.out.println("Number of distinct element: " + count);
*/

/*
--------------Rule 03 --------------
    static ArrayList<Integer> isDistinct(int[] arr, int length) {
        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique.add(arr[i]);
            }
        }
        return unique;
    }
}

 */