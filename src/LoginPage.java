import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import static java.awt.Color.green;

public class LoginPage implements ActionListener {

    JFrame loginPage = new JFrame("Login Page");
    JTextField userIdField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JLabel usernameLabel = new JLabel("username:");
    JLabel passwordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfo) {
        this.loginInfo=loginInfo;

        // Username, Password and Message label texts
        usernameLabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 175, 25);

        // Message that will appear if the username or password is correct or not
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        // Buttons
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);

        // Creating the text-field for the username
        userIdField.setBounds(125, 100, 200, 25);

        // Creating the password-field for the password
        userPassField.setBounds(125, 150, 200, 25);

        loginPage.add(loginButton);
        loginPage.add(resetButton);
        loginPage.add(userIdField);
        loginPage.add(userPassField);
        loginPage.add(usernameLabel);
        loginPage.add(passwordLabel);
        loginPage.add(messageLabel);
        loginPage.setLayout(null);
        loginPage.setSize(420, 420);
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setVisible(true);
    }

     @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == resetButton){
            userIdField.setText("");
            userPassField.setText("");
            }

        if(e.getSource() == loginButton){
            String userID = userIdField.getText();
            String password = String.valueOf(userPassField.getPassword());

            if(loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(green);
                    messageLabel.setText("Login Successful");
                    loginPage.dispose();
                    NewWindow welcomePage = new NewWindow(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Incorrect Password");
                }
            }
                else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Username not found");
                }
        }


    }
}
