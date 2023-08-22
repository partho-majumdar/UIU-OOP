package OOP_GUI_Assignment.Approch_02;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Answer extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private List<User> users;

    public Answer() {
        setTitle("User Authentication");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        users = new ArrayList<>();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton signUpButton = new JButton("Sign Up");
        JButton loginButton = new JButton("Log In");

        signUpButton.addActionListener(e -> signUp());

        loginButton.addActionListener(e -> login());

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(signUpButton);
        panel.add(loginButton);

        add(panel);
    }

    private void signUp() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        users.add(new User(username, password));

        try (FileWriter writer = new FileWriter("userDatabase.txt", true)) {
            writer.write(username + "," + password + "\n");
            writer.flush();
            JOptionPane.showMessageDialog(this, "Username and Password saved successfully");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        clearFields();
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        boolean loggedIn = false;

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(this, "User logged in successfully");
                loggedIn = true;
                break;
            }
        }

        if (!loggedIn) {
            JOptionPane.showMessageDialog(this, "Username or password not matching");
        }

        clearFields();
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
    }

    private class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Answer().setVisible(true));
    }
}
