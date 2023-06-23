package Lab03.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();

        System.out.print("Enter number of line: ");
        int line = input.nextInt();

        for (int i = 0; i < line; i++) {
            System.out.printf("How many number you want to take input in line %d: ", i + 1);
            int eachLine = input.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter value: ");

            for (int j = 0; j < eachLine; j++) {
                list.add(input.nextInt());
            }

            listOfList.add(list);

            input.nextLine(); // for flush
        }

        System.out.println("Enter for output line: ");
        int numQueries = input.nextInt();

        for (int i = 0; i < numQueries; i++) {
            System.out.print("Enter X-th line and Y-th position: ");
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;

            System.out.print("Ans: ");
            if (x < listOfList.size() && y < listOfList.get(x).size()) {
                System.out.println(listOfList.get(x).get(y));
            } else {
                System.out.println("Error");
            }
        }
        input.close();
    }
}
