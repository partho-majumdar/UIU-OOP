package Class_Object.Solution;

public class Q10 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee emp2 = new Employee("John", 2000, " 68D- WallsStreet");
        Employee emp3 = new Employee("Sam", 1999, " 26B- WallsStreet");

        System.out.print("Name" + "\t\t" + " Year of joining " + "\t\t" + "Address\n");
        System.out.print(emp1.name + "\t\t\t" + emp1.year + "\t\t\t" + emp1.address + "\n");
        System.out.print(emp2.name + "\t\t\t" + emp2.year + "\t\t\t" + emp2.address + "\n");
        System.out.print(emp3.name + "\t\t\t\t" + emp3.year + "\t\t\t" + emp3.address + "\n");
    }
}

class Employee {
    String name;
    int year;
    String address;

    Employee(String nam, int yr, String add) {
        this.name = nam;
        this.year = yr;
        this.address = add;
    }
}

/*
Write a program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address
Robert            1994          64C- WallsStreet
Sam               2000          68D- WallsStreet
John              1999          26B- WallsStreet
*/