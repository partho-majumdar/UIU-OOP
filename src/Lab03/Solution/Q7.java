package Lab03.Solution;

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> ans = genUniqueNum(100);
        for (int i = 0; i < 100; i++) {
            System.out.println(ans.get(i));
        }
        secondHighest(ans);
        secondLowest(ans);
    }

    public static ArrayList<Integer> genUniqueNum(int n) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 100);
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

    public static void secondHighest(ArrayList<Integer> arr) {

        int highest = arr.get(0);
        int secondHighest = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > highest) {
                secondHighest = highest;
                highest = arr.get(i);
            } else if (arr.get(i) > secondHighest) {
                secondHighest = arr.get(i);
            }
        }

        System.out.println();
        System.out.println("Second highest value is: " + secondHighest);
    }

    public static void secondLowest(ArrayList<Integer> arr) {

        int lowest = arr.get(0);
        int secondLowest = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < lowest) {
                secondLowest = lowest;
                lowest = arr.get(i);
            } else if (arr.get(i) < secondLowest) {
                secondLowest = arr.get(i);
            }
        }

        System.out.println();
        System.out.println("Second lowest value is: " + secondLowest);
    }
}
