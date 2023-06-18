package Lab03.Solution;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = input.nextLine();
        int len = str.length();
        int ans = isPalindrome(str, len);

        if (ans == 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        input.close();
    }

    static int isPalindrome(String word, int len) {
        int flag = 1;
        for (int i = 0; i < len; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
