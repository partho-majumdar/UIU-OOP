package OOP_4_Pillars.Solution.Solution_03;

import java.util.Calendar;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private Calendar dateOfBirth;

    public abstract double getSalary();

    public Employee(String name, int id, int year, int month, int day) {
        this.name = name;
        this.id = id;
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Employee other) {
        if (this.getSalary() > other.getSalary()) {
            return 1;
        } else if (this.getSalary() == other.getSalary()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getEmployeeType() {
        if (this instanceof FulltimeEmployee) {
            return "Full-time";
        } else if (this instanceof ParttimeEmployee) {
            return "Part-time";
        } else {
            return "Unknown";
        }
    }
}
