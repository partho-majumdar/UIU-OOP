package OOP_4_Pillars.Solution.Solution_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        // Input for outdoor patient
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter OutdoorPatient details for patient " + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Systolic: ");
            int systolic = input.nextInt();
            input.nextLine();

            System.out.print("Diastolic: ");
            int diastolic = input.nextInt();
            input.nextLine();

            System.out.print("Diabetes Point: ");
            int diabetesPoint = input.nextInt();
            input.nextLine();

            System.out.print("Specialty: ");
            String specialty = input.nextLine();

            System.out.print("Consultation Fee: ");
            double consultationFee = input.nextDouble();

            System.out.println("Number of days admit in hospital: ");

            input.nextLine();


            Patient outdoorPatient = new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint, specialty, consultationFee);
            patients.add(outdoorPatient);
        }

        // Input for IndoorPatients
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter IndoorPatient details for patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Systolic: ");
            int systolic = input.nextInt();
            input.nextLine();

            System.out.print("Diastolic: ");
            int diastolic = input.nextInt();
            input.nextLine();

            System.out.print("Diabetes Point: ");
            int diabetesPoint = input.nextInt();
            input.nextLine();

            System.out.print("Admission Date: ");
            String admissionDate = input.nextLine();

            System.out.print("Bed No: ");
            int bedNo = input.nextInt();
            input.nextLine();

            System.out.print("Daily Fee: ");
            double dailyFee = input.nextDouble();
            input.nextLine();

            Patient indoorPatient = new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, admissionDate, bedNo, dailyFee);
            patients.add(indoorPatient);
        }

        // Sort patients based on age
        Collections.sort(patients);

        // Print patients with high or low blood pressure
        System.out.println("Print patients with high or low blood pressure: ");
        for (Patient p : patients) {
            if (p.getSystolic() > 120 || p.getDiastolic() < 80) {
                System.out.println(p);
            }
        }

        for (Patient p : patients) {
            System.out.println("Patient type: " + p.getPatientType());
            System.out.println("Patient details: " + p);

            double invoice = p.getInvoice();
            System.out.println("Invoice: " + invoice);
        }
    }
}
