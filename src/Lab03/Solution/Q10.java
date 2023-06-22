package Lab03.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of element: ");

        int n = input.nextInt();

        ArrayList<Integer> ans = fiboSeries(n);
        int[] ans2 = fiboSeriesUsingArray(n);

        System.out.println("\nAns using array: ");
        System.out.println((Arrays.toString(ans2)));

        System.out.println("\nAns using arraylist: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }

        input.close();
    }

    static ArrayList<Integer> fiboSeries(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);

        int a = 0;
        int b = 1;

        list.add(a);
        list.add(b);

        for (int i = 2; i < n; i++) {
            int val = list.get(i - 1) + list.get(i - 2);
            list.add(val);
        }
        return list;
    }

    static int[] fiboSeriesUsingArray(int n) {
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }
}
