package Lab04.Solution;

public class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPage;
    private int count;

    public Book() {

    }

    public Book(int isbn, String book_title, int num_of_page) {
        this.ISBN = isbn;
        this.bookTitle = book_title;
        this.numberOfPage = num_of_page;
    }

    // setter method
    public void setIsbn(int isbn) {
        this.ISBN = isbn;
    }

    public void setTitle(String book_title) {
        this.bookTitle = book_title;
    }

    public void setNumOfPage(int num_of_page) {
        this.numberOfPage = num_of_page;
    }

    // getter method
    public int getIsbn() {
        return this.ISBN;
    }

    public String getTitle() {
        return this.bookTitle;
    }

    public int getNumOfPage() {
        return this.numberOfPage;
    }

    public int getCount() {
        return this.count;
    }

    // to string method
    public String toString() {
        return "ISBN: " + this.ISBN + ", Title: " + this.bookTitle + ", Page: " + this.numberOfPage;
    }

    // compare to method
    public int compareTo(Book other) {
        if (this.numberOfPage > other.numberOfPage) {
            return 1;
        } else if (this.numberOfPage == other.numberOfPage) {
            return 0;
        } else {
            return -1;
        }
    }
}
