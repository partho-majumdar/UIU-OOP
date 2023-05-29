package Lab02.Solution;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("a" + "  " + "a2" + "  " + "a3");

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "  ");

            for (int j = i; j == i; j++) {
                System.out.print(j * j + "   ");
            }

            for (int k = i; k == i; k++) {
                System.out.print(k * k * k);
            }

            System.out.println();
        }
    }
}