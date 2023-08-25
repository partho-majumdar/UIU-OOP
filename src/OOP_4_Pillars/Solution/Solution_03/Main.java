package OOP_4_Pillars.Solution.Solution_03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        // full-time employee
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Enter id: ");
            int id = input.nextInt();
            System.out.println("Enter birth day in integer: ");
            int day = input.nextInt();
            System.out.println("Enter birth month in integer: ");
            int month = input.nextInt();
            System.out.println("Enter birth year in integer: ");
            int year = input.nextInt();
            System.out.println("Enter monthly salary: ");
            double monthlySalary = input.nextDouble();

            input.nextLine();

            Employee fullTimeEmp = new FulltimeEmployee(name, id, day, month, year, monthlySalary);

            int flag = 0;
            for (Employee e : employees) {
                if (isEmployeeIdExist(e.getId())) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                employees.add(fullTimeEmp);
            }
        }

        // part-time employee
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Enter id: ");
            int id = input.nextInt();
            System.out.println("Enter birth day in integer: ");
            int day = input.nextInt();
            System.out.println("Enter birth month in integer: ");
            int month = input.nextInt();
            System.out.println("Enter birth year in integer: ");
            int year = input.nextInt();
            System.out.println("Enter work hour: ");
            int hr = input.nextInt();
            System.out.println("Enter hourly rate: ");
            double hrRate = input.nextDouble();

            input.nextLine();

            Employee partTimeEmp = new ParttimeEmployee(name, id, day, month, year, hr, hrRate);

            int flag = 0;
            for (Employee e : employees) {
                if (isEmployeeIdExist(e.getId())) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                employees.add(partTimeEmp);
            }
        }

        // sort employee by salary
        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println("Employee type: " + e.getEmployeeType());
            System.out.println("Print Details: " + e);
            System.out.println("Salary: " + e.getSalary());
        }

        // Print all the employee info having the same birth year
        System.out.println("Enter birth year toh find employee info: ");
        int birthYear = input.nextInt();
        printEmployeesByBirthYear(birthYear);
    }

    public static boolean isEmployeeIdExist(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void printEmployeesByBirthYear(int year) {
        System.out.println("Employees born in " + year + ":");
        for (Employee e : employees) {
            if (e.getDateOfBirth().get(Calendar.YEAR) == year) {
                System.out.println("Name: " + e.getName() + ", ID: " + e.getId() +
                        ", DOB: " + e.getDateOfBirth().get(Calendar.YEAR));
            }
        }
    }
}
