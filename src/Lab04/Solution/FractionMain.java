package Lab04.Solution;

public class FractionMain {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 5);

        System.out.println("Fraction 1: " + fraction1.toString());
        System.out.println("Fraction 2: " + fraction2.toString());

        fraction1.add(fraction2);
        System.out.println("After addition: " + fraction1.toString());

        fraction1.subtract(fraction2);
        System.out.println("After subtraction: " + fraction1.toString());

        fraction1.multiply(fraction2);
        System.out.println("After multiplication: " + fraction1.toString());

        fraction1.divide(fraction2);
        System.out.println("After division: " + fraction1.toString());
    }
}
