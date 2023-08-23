package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton login , clear , signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {
        setTitle("Automated Teller Machine (ATM)");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon logo = new ImageIcon(i2);

        ////////////////////////////////////////////////////////////////////////////////////////////

        JLabel label = new JLabel(logo);
        label.setBounds(70, 10, 80, 80);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 30, 400, 40);
        text.setFont(new Font("Oswald",Font.BOLD,38));
        add(text);

        JLabel cardNumber = new JLabel("CARD No:");
        cardNumber.setBounds(120, 150, 170, 30);
        cardNumber.setFont(new Font("Raleway",Font.BOLD,28));
        add(cardNumber);

        cardTextField = new JTextField();
        cardTextField.setBounds(330,150,300,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 220, 170, 30);
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(330,220,300,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(pinTextField);

        ////////////////////////////////////////////////////////////////////////////////////////////

        login = new JButton("Sign-In");
        login.setBounds(330,280,130,25);
        login.setBackground(Color.cyan);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(500,280,130,25);
        clear.setBackground(Color.RED);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("Sign-Up");
        signUp.setBounds(330,320,300,25);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);

        ////////////////////////////////////////////////////////////////////////////////////////////

        getContentPane().setBackground(Color.white);

        ////////////////////////////////////////////////////////////////////////////////////////////

        setSize(800, 480);
        setVisible(true);
        setLocation(300, 150);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear){

            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource() == login) {

        } else if (ae.getSource() == signUp) {
            setVisible(false);

            new SignUpOne().setVisible(true);
        }

    }


    public static void main(String[] args) {
        new Login();
    }


}
