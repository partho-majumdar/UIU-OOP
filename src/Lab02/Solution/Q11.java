package Lab02.Solution;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes: ");
        int minute = input.nextInt();

        float value_in_hour = (float) minute / 60;
        float value_in_day = value_in_hour / 24;

        int years = (int) value_in_day / 365;
        int days = (int) value_in_day % 365;

        System.out.println(years + " years and " + days + " days");
    }
}
