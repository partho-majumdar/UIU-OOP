package Class_Object.Solution;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first complex number: ");
        System.out.print("First real number: ");
        double real1 = input.nextDouble();
        System.out.print("First imaginary number: ");
        double img1 = input.nextDouble();

        System.out.println("Enter second complex number: ");
        System.out.print("Second real number: ");
        double real2 = input.nextDouble();
        System.out.print("Second imaginary number: ");
        double img2 = input.nextDouble();

        Complex c1 = new Complex(real1, img1);
        Complex c2 = new Complex(real2, img2);

        Complex add = c1.sum(c2);
        Complex sub = c1.difference(c2);
        Complex multi = c1.product(c2);

        System.out.println("Sum: " + add);
        System.out.println("Subtract: " + sub);
        System.out.println("Multiplication: " + multi);

        input.close();
    }
}

class Complex {
    double real;
    double imaginary;

    Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    Complex sum(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    Complex difference(Complex other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new Complex(diffReal, diffImaginary);
    }

    Complex product(Complex other) {
        double proReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double proImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(proReal, proImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

/*
 * Print the sum, difference and product of two complex numbers
 * by creating a class named 'Complex' with separate methods for
 * each operation whose real and imaginary parts are entered by user.
 */