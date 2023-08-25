package OOP_4_Pillars.Solution.Solution_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<University> universities = new ArrayList<>();

    public static void main(String[] args) {

        //Public university
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter Public University details:");
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Address: ");
            String address = input.nextLine();
            System.out.print("Establishment Year: ");
            int year = input.nextInt();
            System.out.print("Number of Departments: ");
            int departments = input.nextInt();
            System.out.print("Number of Halls: ");
            int halls = input.nextInt();
            System.out.print("Politics Allowed (true/false): ");
            boolean politics = input.nextBoolean();

            University publicUni = new PublicUniversity(name, address, year, departments, halls, politics);
            universities.add(publicUni);
        }

        // Private university
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Private University details:");
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Address: ");
            String address = input.nextLine();
            System.out.print("Establishment Year: ");
            int year = input.nextInt();
            System.out.print("Number of Departments: ");
            int departments = input.nextInt();
            System.out.print("UGC Approved (true/false): ");
            boolean ugcApproved = input.nextBoolean();
            System.out.print("Number of Trustee Members: ");
            int trustees = input.nextInt();

            University privateUni = new PrivateUniversity(name, address, year, departments, ugcApproved, trustees);
            universities.add(privateUni);
        }

        // Sorting universities
        Collections.sort(universities);

        // Printing UGC approved universities
        System.out.println("UGC Approved Universities:");
        for (University uni : universities) {
            if (uni.isUgcApproved()) {
                System.out.println(uni);
            }
        }

        // Printing universities where politics are not allowed
        System.out.println("Universities where politics are not allowed:");
        for (University uni : universities) {
            if (!uni.isPoliticsAllowed()) {
                System.out.println(uni);
            }
        }

        // Taking address input and displaying universities from that address
        System.out.print("Enter an address to find universities from that address: ");
        String inputAddress = input.nextLine();
        System.out.println("Universities from " + inputAddress + ":");
        for (University uni : universities) {
            if (uni.getAddress().equals(inputAddress)) {
                System.out.println(uni);
            }
        }

        // Printing details of all universities
        System.out.println("Details of all universities:");
        for (University uni : universities) {
            System.out.println(uni);
        }
    }
}
