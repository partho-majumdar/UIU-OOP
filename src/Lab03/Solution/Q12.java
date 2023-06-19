package Lab03.Solution;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of element in array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        input.close();
    }
}

/*
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.print("Enter number of element in array: ");
 * int n = input.nextInt();
 * 
 * ArrayList<Integer> list = new ArrayList<>();
 * 
 * for (int i = 0; i < n; i++) {
 * int value = input.nextInt();
 * list.add(value);
 * }
 * 
 * int flag = 0;
 * 
 * ArrayList<Integer> list2 = new ArrayList<>();
 * 
 * for (int i = 0; i < list.size(); i++) {
 * int num = list.get(i);
 * 
 * if (i == 0) {
 * list2.add(num);
 * } else {
 * if (list2.contains(num)) {
 * flag = 1;
 * break;
 * } else {
 * list2.add(num);
 * }
 * }
 * }
 * 
 * if (flag == 1) {
 * System.out.println("true");
 * } else {
 * System.out.println("false");
 * }
 * 
 * input.close();
 */