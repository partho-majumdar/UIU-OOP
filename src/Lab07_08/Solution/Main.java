package Lab07_08.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Account> mainAccountObj = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("1. Creating a checking account");
            System.out.println("2. Creating a savings account");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account ID: ");
                int checkingId = input.nextInt();
                System.out.print("Enter Initial Balance: ");
                double checkingBalance = input.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                double checkingInterestRate = input.nextDouble();
                System.out.print("Enter Overdraft Limit: ");
                double overdraftLimit = input.nextDouble();

                Account obj1 = new CheckingAccount(checkingId, checkingBalance, checkingInterestRate, overdraftLimit);
                mainAccountObj.add(obj1);

            } else if (choice == 2) {
                System.out.print("Enter Account ID: ");
                int savingsId = input.nextInt();
                System.out.print("Enter Initial Balance: ");
                double savingsBalance = input.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                double savingsInterestRate = input.nextDouble();

                Account obj2 = new SavingsAccount(savingsId, savingsBalance, savingsInterestRate);
                mainAccountObj.add(obj2);

            } else {
                System.out.println("Invalid input");
            }
        } // end of for loop

        // these two method are for polymorphism(method overriding --> Runtime polymorphism)
        Account subObj1 = new CheckingAccount();
        Account subObj2 = new SavingsAccount();
    }
}
