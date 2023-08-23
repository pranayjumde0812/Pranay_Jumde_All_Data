package bankManagementSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpOne extends JFrame implements ActionListener {

    long ran;
    JTextField nameTextField, middleNameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinCodeTextField;
    JButton next;
    JRadioButton male, female, married, unMarried, other;
    JDateChooser dateChooser;

    SignUpOne() {

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM : Page 1");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Random random = new Random();
        ran = Math.abs(random.nextLong() % 9000 + 1000);
        ////////////////////////////////////////////////////////////////////////////////////////

        JLabel formNumber = new JLabel("Application Form No: " + ran);
        formNumber.setFont(new Font("Raleway", Font.BOLD, 38));
        formNumber.setBounds(140, 20, 600, 40);
        add(formNumber);

        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        ////////////////////////////////////////////////////////////////////////////////////////

        JLabel name = new JLabel("Name ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 200, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(nameTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel middleName = new JLabel("Father's Name ");
        middleName.setFont(new Font("Raleway", Font.BOLD, 20));
        middleName.setBounds(100, 190, 200, 30);
        add(middleName);

        middleNameTextField = new JTextField();
        middleNameTextField.setBounds(300, 190, 400, 30);
        middleNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(middleNameTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel dob = new JLabel("Date of Birth ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        dateChooser.setForeground(Color.BLACK);
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel gender = new JLabel("Gender ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGrp = new ButtonGroup();
        genderGrp.add(male);
        genderGrp.add(female);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel email = new JLabel("Email Address ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 340, 400, 30);
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(emailTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel maritalStatus = new JLabel("Marital Status ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unMarried = new JRadioButton("Unmarried");
        unMarried.setBounds(450, 390, 100, 30);
        unMarried.setBackground(Color.WHITE);
        add(unMarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalStatusGrp = new ButtonGroup();
        maritalStatusGrp.add(married);
        maritalStatusGrp.add(unMarried);
        maritalStatusGrp.add(other);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel address = new JLabel("Address ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel city = new JLabel("City ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel state = new JLabel("State ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(300, 540, 400, 30);
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stateTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel pinCode = new JLabel("Pin-Code ");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);

        pinCodeTextField = new JTextField();
        pinCodeTextField.setBounds(300, 590, 400, 30);
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pinCodeTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        next = new JButton("Next");
        next.setBounds(620, 640, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        getContentPane().setBackground(Color.WHITE);

        //////////////////////////////////////////////////////////////////
        setSize(850, 800);
        setLocation(300, 10);
        setVisible(true);
    }


    public static void main(String[] args) {
        new SignUpOne();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        String formNumber = String.valueOf(ran);
        String name = nameTextField.getText();
        String middleName = middleNameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String maritalStatus = null;
        if (married.isSelected()) {
            maritalStatus = "Married";
        } else if (unMarried.isSelected()) {
            maritalStatus = "Unmarried";
        } else if (other.isSelected()) {
            maritalStatus = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinCodeTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Date Of Birth is Required");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is Required");
            } else {
                DatabaseConfig db = new DatabaseConfig();

                String query = "INSERT INTO signup VALUES('" + formNumber + "','" + name + "','" + middleName + "','" + dob + "','" + gender + "','" + email + "','" + maritalStatus + "','" + address + "','" + city + "','" + state + "','" + pincode + "')";
                db.statement.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formNumber).setVisible(true);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
