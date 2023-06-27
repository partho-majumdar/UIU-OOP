package Lab02.Solution;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter runner runs in km: ");
        float run_in_km = input.nextFloat();

        System.out.print("Enter time in minute: ");
        float time_in_min = input.nextFloat();

        System.out.print("Enter time in second: ");
        float time_in_sec = input.nextFloat();

        double miles = run_in_km / 1.6f;
        double time_in_hour = (float) ((time_in_min * 60) + time_in_sec) / 3600.0f;

        double miles_per_hour = miles / time_in_hour;
        System.out.println("Miles per hour: " + miles_per_hour);

        input.close();
    }
}