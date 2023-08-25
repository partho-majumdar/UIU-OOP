package OOP_4_Pillars.Solution.Solution_02;

import java.util.Scanner;

public class IndoorPatient extends Patient {
    private String admissionDate;
    private int bedNo;
    private double dailyFee;

    public IndoorPatient(String name, int age, int systolic, int diastolic, int diabetesPoint, String admissionDate,
                         int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIndoorPatient{" +
                "admissionDate='" + admissionDate + '\'' +
                ", bedNo=" + bedNo +
                ", dailyFee=" + dailyFee +
                '}';
    }

    @Override
    public double getInvoice() {
        System.out.println("Enter number of days admit in hospital: ");
        Scanner input = new Scanner(System.in);
        int numberOfDays = input.nextInt();
        double totalBill = numberOfDays * getDailyFee();
        return totalBill;
    }
}
