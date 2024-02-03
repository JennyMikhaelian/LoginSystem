import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame("Welcome!");
    JLabel welcomeMessage = new JLabel();

    NewWindow(String userID){

        welcomeMessage.setText("Hello "+userID);
        welcomeMessage.setFont(new Font(null,Font.BOLD,25));
        welcomeMessage.setBounds(0,0,200,35);


        frame.add(welcomeMessage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setVisible(true);


    }

}
