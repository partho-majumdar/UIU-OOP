package Lab04.ClassObjectBasic;

import Lab04.ClassObjectBasic.IcecreamProject.src1.Icecream;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Icecream> icecreams = new ArrayList<>();

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
            for (Icecream e : icecreams) {
                if (other.equals(e)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                icecreams.add(other);
            } else {
                System.out.println("Already exists!");
            }
        }

        for (Icecream e : icecreams) {
            System.out.println(e.toString());
        }

        searchByCompany("Igloo");
        sortByPrice();

        for (Icecream e : icecreams) {
            System.out.println(e.toString());
        }
        input.close();
    }

    public static void searchByCompany(String company) {
        for (Icecream e : icecreams) {
            if (e.getIcecreamCompany().equals(company)) {
                System.out.println(e.toString());
            }
        }
    }

    public static void sortByPrice() {
        for (int i = 0; i < icecreams.size(); i++) {
            for (int j = i + 1; j < icecreams.size(); j++) {
                if (icecreams.get(i).getIcecreamPrice() > icecreams.get(j).getIcecreamPrice()) {
                    Icecream other = icecreams.get(i);
                    icecreams.set(i, icecreams.get(j));
                    icecreams.set(j, other);
                }
            }
        }
    }
}