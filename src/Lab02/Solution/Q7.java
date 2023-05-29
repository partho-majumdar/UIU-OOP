package Lab02.Solution;

public class Q7 {
    public static void main(String[] args) {
        double miles = 14 / 1.6f;
        double time_in_hour = (float) ((45 * 60) + 30) / 3600.0f;

        double miles_per_hour = miles / time_in_hour;
        System.out.println(miles_per_hour);
    }
}