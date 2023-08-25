package Lab07_08.Solution;

import java.util.Calendar;

public class SavingsAccount extends Account {
    private String creditCardNumber;
    private Calendar cardExpiryDate;

    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        cardExpiryDate = Calendar.getInstance();
        creditCardNumber = generateCardNumber();
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Calendar getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(Calendar cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public double getCreditBalance() {
        return getBalance() * 3.0;
    }

    public String generateCardNumber() {
        for (int i = 0; i < 16; i++) {
            int digit = (int) (Math.random() * 10);
            creditCardNumber += digit;
        }
        return creditCardNumber;
    }
}
