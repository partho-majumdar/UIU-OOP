package Lab02.Solution;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        float a = input.nextFloat();

        System.out.print("Enter value of b: ");
        float b = input.nextFloat();

        System.out.print("Enter value of c: ");
        float c = input.nextFloat();

        float dis = (b * b) - (4 * a * c);
        System.out.println(dis);

        if (dis > 0) {
            double r1 = (-b + (Math.sqrt(dis))) / (2 * a);
            double r2 = (-b - (Math.sqrt(dis))) / (2 * a);

            System.out.println("Real Root 1: " + r1);
            System.out.println("Real Root 2: " + r2);
        } else if (dis == 0) {
            float rr = -b / 2 * a;
            System.out.println("Real Root: " + rr);
        } else if (dis < 0) {
            System.out.println("This equation has no real roots");
        }
    }
}
