package OOP_4_Pillars.Solution.Solution_03;

public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, int id, int day, int month, int year, double monthlySalary) {
        super(name, id, day, month, year);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary() {
        return getMonthlySalary();
    }

    @Override
    public String toString() {
        return super.toString() + "\nFull-timeEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
