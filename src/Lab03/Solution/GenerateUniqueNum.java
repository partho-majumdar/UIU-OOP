package Lab03.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateUniqueNum {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter how many number you want to generate: ");
        int n = input.nextInt();
        ArrayList<Integer> ans = genUniqueNum(n);
        for (int i = 0; i < n; i++) {
            System.out.println(ans.get(i));
        }
    }

    public static ArrayList<Integer> genUniqueNum(int n) {
        ArrayList<Integer> unique = new ArrayList<>();

        System.out.print("From where you want to print random number: ");
        int start = input.nextInt();

        for (int i = 0; i < n; i++) {
            int num = start + (int) (Math.random() * 100);
            if (i == 0) {
                unique.add(num);
            } else {
                if (unique.contains(num)) {
                    i--;
                } else {
                    unique.add(num);
                }
            }
        }
        return unique;
    }
}

// This program will generate random unique number in ArrayList
