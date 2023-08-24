package Lab05_06.Mid_Project.University;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Line[] lines = new Line[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter x1 for Line " + (i + 1) + ":");
            double x1 = scanner.nextDouble();
            System.out.println("Enter y1 for Line " + (i + 1) + ":");
            double y1 = scanner.nextDouble();
            System.out.println("Enter x2 for Line " + (i + 1) + ":");
            double x2 = scanner.nextDouble();
            System.out.println("Enter y2 for Line " + (i + 1) + ":");
            double y2 = scanner.nextDouble();

            lines[i] = new Line(x1, y1, x2, y2);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(lines[i].toString());
        }

        boolean intersecting = Line.isIntersecting(lines[0], lines[1]);
        System.out.println("Lines 1 and 2 intersect: " + intersecting);

        intersecting = Line.isIntersecting(lines[2], lines[3]);
        System.out.println("Lines 3 and 4 intersect: " + intersecting);

        scanner.close();
    }
}

class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double findSlope() {
        return (y2 - y1) / (x2 - x1);
    }

    public String toString() {
        return "Line has points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
    }

    public static boolean isIntersecting(Line l1, Line l2) {
        double slope1 = l1.findSlope();
        double slope2 = l2.findSlope();

        return slope1 != slope2;
    }
}
