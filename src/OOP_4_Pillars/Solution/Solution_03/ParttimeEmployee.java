package OOP_4_Pillars.Solution.Solution_03;

public class ParttimeEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public ParttimeEmployee(String name, int id, int day, int month, int year, int hr, double hrRate) {
        super(name, id, day, month, year);
        this.hours = hr;
        this.hourlyRate = hrRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return getHours() * getHourlyRate();
    }

    @Override
    public String toString() {
        return super.toString() + "\nPart-timeEmployee{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
