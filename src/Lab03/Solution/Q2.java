package Lab03.Solution;

import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));

        while (n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        JOptionPane.showMessageDialog(null, "GCD: " + n1);
    }
}
