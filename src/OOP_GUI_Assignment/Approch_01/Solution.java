package OOP_GUI_Assignment.Approch_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Solution extends JFrame {

    JPanel panel1;
    JLabel label1, label2;
    JTextField textField1, textField2;
    JButton button1, button2;

    public Solution() {
        this.setTitle("Login System");
        this.setSize(450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        // this is for username field
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 450, 450);
        panel1.setBackground(Color.LIGHT_GRAY);

        label1 = new JLabel();
        label1.setText("Enter Username: ");

        textField1 = new JTextField(27);

        panel1.add(label1);
        panel1.add(textField1);

        // this is for password field
        label2 = new JLabel();
        label2.setText("Enter Password: ");

        textField2 = new JTextField(27);

        panel1.add(label2);
        panel1.add((textField2));

        // this is for button
        button1 = new JButton("Sign Up");
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signup();
            }
        });

        button2 = new JButton("Log In");
        button2.setFocusable(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        panel1.add(button1);
        panel1.add(button2);

        this.add(panel1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.setVisible(true);
    }

    public void signup() {
        try {
            String username = textField1.getText();
            String password = new String(textField2.getText());

            if (username.trim().isEmpty() || password.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both username and password.");
                return;
            }

            FileWriter fw = new FileWriter("database.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(username + " " + password + " ");

            JOptionPane.showMessageDialog(this, "Username and Password saved successfully");

            textField1.setText("");
            textField2.setText("");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void login() {
        try {
            String username = textField1.getText();
            String password = new String(textField2.getText());

            FileReader fr = new FileReader("database.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int flag = 0;

            while ((line = br.readLine()) != null) {

                String[] strArr = line.split(" ");
                for (int i = 0; i < strArr.length; i += 2) {
                    String savedUsername = strArr[i].trim();
                    String savedPassword = strArr[i + 1].trim();

                    if (username.equals(savedUsername) && password.equals(savedPassword)) {
                        JOptionPane.showMessageDialog(this, "User logged in successfully");
                        flag = 1;
                        textField1.setText("");
                        textField2.setText("");
                        break;
                    }
                }
            }
            if (flag == 0) {
                JOptionPane.showMessageDialog(this, "Username or password not matching", line,
                        JOptionPane.ERROR_MESSAGE);
                textField1.setText("");
                textField2.setText("");

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
