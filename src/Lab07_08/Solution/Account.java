package Lab07_08.Solution;

import java.util.Calendar;

public abstract class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Calendar dateCreated;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = Calendar.getInstance();
    }

    // abstract method
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100; // divide by 100 cause ans return in %
    }

    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }
}
