package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadhaarTextField;
    JButton submit;
    JRadioButton sYes, sNo, exYes, exNo;
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, eduQualificationComboBox, occupationComboBox;
    String formNumber;

    SignUpTwo(String formNumber) {

        this.formNumber = formNumber;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM : Page 2");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 40, 400, 30);
        add(additionalDetails);
        ////////////////////////////////////////////////////////////////////////////////////////

        JLabel religion = new JLabel("Religion");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 200, 30);
        add(religion);

        String[] religionValue = {"Hindu", "Muslim", "Parsi", "Sikh", "Cristian", "Other"};
        religionComboBox = new JComboBox(religionValue);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.WHITE);
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(religionComboBox);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel category = new JLabel("Category");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String[] categoryValue = {"General", "OBC", "SC", "ST", "SBC", "NT", "Other"};
        categoryComboBox = new JComboBox(categoryValue);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.WHITE);
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(categoryComboBox);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel income = new JLabel("Income");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String[] incomeValue = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        incomeComboBox = new JComboBox(incomeValue);
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        JLabel eduQualification = new JLabel("Qualification");
        eduQualification.setFont(new Font("Raleway", Font.BOLD, 20));
        eduQualification.setBounds(100, 315, 200, 30);
        add(eduQualification);

        String[] eduQualificationValue = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctorate", "Other"};
        eduQualificationComboBox = new JComboBox(eduQualificationValue);
        eduQualificationComboBox.setBounds(300, 315, 400, 30);
        eduQualificationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        eduQualificationComboBox.setBackground(Color.WHITE);
        add(eduQualificationComboBox);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel occupation = new JLabel("Occupation");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String[] occupationValue = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        occupationComboBox = new JComboBox(occupationValue);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel panNumber = new JLabel("PAN Number");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);

        panTextField = new JTextField();
        panTextField.setBounds(300, 440, 400, 30);
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(panTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel aadhaarNumber = new JLabel("Aadhaar Number");
        aadhaarNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhaarNumber.setBounds(100, 490, 200, 30);
        add(aadhaarNumber);

        aadhaarTextField = new JTextField();
        aadhaarTextField.setBounds(300, 490, 400, 30);
        aadhaarTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(aadhaarTextField);
        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel seniorCitizen = new JLabel("Senior Citizen");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(300, 540, 100, 30);
        sYes.setBackground(Color.WHITE);
        sYes.setFont(new Font("Raleway", Font.BOLD, 14));
        add(sYes);

        sNo = new JRadioButton("No");
        sNo.setBounds(450, 540, 100, 30);
        sNo.setBackground(Color.WHITE);
        sNo.setFont(new Font("Raleway", Font.BOLD, 14));
        add(sNo);

        ButtonGroup seniorCitizenGrp = new ButtonGroup();
        seniorCitizenGrp.add(sYes);
        seniorCitizenGrp.add(sNo);

        /////////////////////////////////////////////////////////////////////////////////////////

        JLabel existingAccount = new JLabel("Existing Account");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 590, 200, 30);
        add(existingAccount);

        exYes = new JRadioButton("Yes");
        exYes.setBounds(300, 590, 100, 30);
        exYes.setBackground(Color.WHITE);
        exYes.setFont(new Font("Raleway", Font.BOLD, 14));
        add(exYes);

        exNo = new JRadioButton("No");
        exNo.setBounds(450, 590, 100, 30);
        exNo.setBackground(Color.WHITE);
        exNo.setFont(new Font("Raleway", Font.BOLD, 14));
        add(exNo);

        ButtonGroup existingAccGrp = new ButtonGroup();
        existingAccGrp.add(exYes);
        existingAccGrp.add(exNo);

        /////////////////////////////////////////////////////////////////////////////////////////

        submit = new JButton("Submit");
        submit.setBounds(600, 640, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        getContentPane().setBackground(Color.WHITE);

        //////////////////////////////////////////////////////////////////
        setSize(850, 800);
        setLocation(300, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUpTwo("");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String) religionComboBox.getSelectedItem();
        String category = (String) categoryComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String eduQualification = (String) eduQualificationComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();
        String panNumber = panTextField.getText();
        String aadhaarNumber = aadhaarTextField.getText();

        String seniorCitizen = null;
        if (sYes.isSelected()) {
            seniorCitizen = "Yes";
        } else if (sNo.isSelected()) {
            seniorCitizen = "No";
        }

        String existingAccount = null;
        if (exYes.isSelected()) {
            existingAccount = "Yes";
        } else if (exNo.isSelected()) {
            existingAccount = "No";
        }

        try {
            if (panNumber.equals("")) {
                JOptionPane.showMessageDialog(null, "PAN Number is Required");
            } else if (aadhaarNumber.equals("")) {
                JOptionPane.showMessageDialog(null, "Aadhaar Number is Required");
            } else {
                DatabaseConfig db = new DatabaseConfig();

                String query = "INSERT INTO signup_addidional_info VALUES('" + formNumber + "','" + religion + "','" + category + "','" + income + "','" + eduQualification + "','" + occupation + "','" + panNumber + "','" + aadhaarNumber + "','" + seniorCitizen + "','" + existingAccount + "')";
                db.statement.executeUpdate(query);

                setVisible(false);

                new Login().setVisible(true);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
