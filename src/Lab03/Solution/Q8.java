package Lab03.Solution;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of student: ");
        int numberOfStudent = input.nextInt();

        String[][] studentData = new String[numberOfStudent][2];

        for (int i = 0; i < numberOfStudent; i++) {

            input.nextLine(); // flush for enter

            System.out.printf("Enter name of student %d: ", i + 1);
            studentData[i][0] = input.next();

            System.out.printf("Enter score of student %d: ", i + 1);
            studentData[i][1] = String.valueOf(input.nextInt());
        }

        sortByScore(studentData);

        input.close();
    }

    public static void sortByScore(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int score1 = Integer.parseInt(arr[j][1]);
                int score2 = Integer.parseInt(arr[j - 1][1]);

                if (score1 > score2) {
                    // Swap names
                    String tempName = arr[j][0];
                    arr[j][0] = arr[j - 1][0];
                    arr[j - 1][0] = tempName;

                    // Swap scores
                    String tempScore = arr[j][1];
                    arr[j][1] = arr[j - 1][1];
                    arr[j - 1][1] = tempScore;
                }
            }
        }

        System.out.println("Student name in decreasing order by score: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
