package Lab02.Solution;

import javax.swing.*;

public class Q13 {
    public static void main(String[] args) {

        int input1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 0 (convert USD to BDT) and 1 (convert BDT to USD): "));

        if (input1 == 0) {
            float val = Float.parseFloat(JOptionPane.showInputDialog("Enter USD: "));
            float ans = val * 90;
            JOptionPane.showMessageDialog(null, "BDT: " + ans + " TK");
        } else if (input1 == 1) {
            float val1 = Float.parseFloat(JOptionPane.showInputDialog("Enter BDT: "));
            float ans1 = val1 / 90;
            JOptionPane.showMessageDialog(null, "USD: " + ans1 + " $");
        } else {
            JOptionPane.showMessageDialog(null, "Enter valid input.");
        }
    }
}
