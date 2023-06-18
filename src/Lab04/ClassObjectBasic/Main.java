import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Icecream> icecreams = new ArrayList<>();

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
                    Icecream I = icecreams.get(i);
                    icecreams.set(i, icecreams.get(j));
                    icecreams.set(j, I);
                }
            }
        }
    }

    public static void main(String[] args) {

        // Icecream I1 = new Icecream("Vanilla", "Polar", 250.0);
        // System.out.println(I1.toString());
        // I1.setIcecreamType("Chocolate");
        // System.out.println(I1.toString());
        // Icecream I2 = new Icecream("Vanilla", "Polar", 250.0);
        // I1.equals(I2);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("0. Exit\n1. Input");
            int x = input.nextInt();
            if (x == 0)
                break;
            System.out.println("Enter the flavor: ");
            String type = input.next();
            System.out.println("Company: ");
            String company = input.next();
            System.out.println("Price: ");
            double price = input.nextDouble();
            Icecream I = new Icecream(type, company, price);
            boolean flag = true;
            for (Icecream e : icecreams) {
                if (I.equals(e)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                icecreams.add(I);
            else
                System.out.println("Already exists!");
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
}