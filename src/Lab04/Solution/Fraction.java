package Lab04.Solution;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }

    // setter method
    public void setNumerator(int num) {
        this.numerator = num;
    }

    public void setDenominator(int den) {
        this.denominator = den;
    }

    // getter method
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    // toString method
    public String toString() {
        return "Numerator: " + this.numerator + ", Denominator " + this.denominator;
    }

    public void add(Fraction fraction) {
        int newDenominator = this.denominator * fraction.denominator;
        int newNumerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        simplify();
    }

    public void subtract(Fraction fraction) {
        int newDenominator = this.denominator * fraction.denominator;
        int newNumerator = (this.numerator * fraction.denominator) - (fraction.numerator * this.denominator);
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        simplify();
    }

    public void multiply(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        simplify();
    }

    public void divide(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        simplify();
    }

    private void simplify() {
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int greatestCommonDivisor(int a, int b) {
        if (b == 0)
            return a;
        return greatestCommonDivisor(b, a % b);
    }
}
