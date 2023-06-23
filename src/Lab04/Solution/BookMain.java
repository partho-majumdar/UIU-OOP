package Lab04.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    public static ArrayList<Book> bookObj = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter isbn number: ");
            int isbn = input.nextInt();

            input.nextLine();
            System.out.print("Enter book title: ");
            String title = input.nextLine();

            System.out.print("Enter number of page: ");
            int page = input.nextInt();

            Book eachObj = new Book(isbn, title, page);
            bookObj.add(eachObj);
        }

        // call displayAll function
        System.out.println();
        displayAll();

        // compare by using compareTo method
        System.out.println();
        for (int i = 0; i < bookObj.size(); i++) {
            for (int j = i + 1; j < bookObj.size(); j++) {
                Book book1 = bookObj.get(i);
                Book book2 = bookObj.get(j);

                int ans = book1.compareTo(book2);
                System.out.println(ans);
            }
        }

        // call isHeavier function
        System.out.println();
        System.out.println("Heavier book are: ");
        for (Book b : bookObj) {
            boolean ans = isHeavier(b);

            if (ans) {
                System.out.println(b.toString());
            }
        }

        input.close();
    }

    // all are function
    public static void displayAll() {
        for (int i = 0; i < bookObj.size(); i++) {
            Book other = bookObj.get(i);
            System.out.println(other.toString());
        }
    }

    public static boolean isHeavier(Book other) {
        return other.getNumOfPage() > 500;
    }
}
