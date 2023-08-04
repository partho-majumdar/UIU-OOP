package Lab04.ClassObjectBasic;

import Lab04.ClassObjectBasic.IcecreamProject.src1.Icecream;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Icecream> icecreamsObject = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input: ");

        while (true) {
            System.out.println("0. Exit\n1. Input");
            int x = input.nextInt();
            if (x == 0) {
                break;
            }

            System.out.print("Enter the flavor: ");
            String type = input.next();
            System.out.print("Company: ");
            String company = input.next();
            System.out.print("Price: ");
            double price = input.nextDouble();

            Icecream other = new Icecream(type, company, price);

            boolean flag = true;
            for (Icecream e : icecreamsObject) {
                if (other.equals(e)) {
                    flag = false;
                    break;
                }
            }

            /*
             * ------------ Rule - 02 ---------
             * for (int i = 0; i < icecreamObj.size(); i++) {
             * Icecream individualObj = icecreamObj.get(i);
             *
             * if (individualObj.equals(other)) {
             * flag = false;
             * break;
             * }
             * }
             */

            if (flag) {
                icecreamsObject.add(other);
            } else {
                System.out.println("Already exists!");
            }
        }

        for (Icecream e : icecreamsObject) {
            System.out.println(e.toString());
        }

        // search by company
        System.out.println("Enter company: ");
        String userCompany = input.next();
        searchByCompany(userCompany);

        // sort icecream object by price
        sortByPrice();

        // this for loop print all details
        for (Icecream e : icecreamsObject) {
            System.out.println(e.toString());
        }
        input.close();
    }

    public static void searchByCompany(String company) {
        for (Icecream e : icecreamsObject) {
            if (e.getIcecreamCompany().equals(company)) {
                System.out.println("Icecream type: " + e.getIcecreamType());
                System.out.println("Icecream company: " + e.getIcecreamCompany());
                System.out.println("Icecream price: " + e.getIcecreamPrice());
            }
        }
    }

    public static void sortByPrice() {
        for (int i = 0; i < icecreamsObject.size(); i++) {
            for (int j = i + 1; j < icecreamsObject.size(); j++) {
                if (icecreamsObject.get(i).getIcecreamPrice() > icecreamsObject.get(j).getIcecreamPrice()) {
                    Icecream other = icecreamsObject.get(i);
                    icecreamsObject.set(i, icecreamsObject.get(j));
                    icecreamsObject.set(j, other);
                }
            }
        }
    }
}