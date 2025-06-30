package view;
import javax.swing.*;
import controller.AppController;
import model.User;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField phoneField;
    private JTextField emailField;
    private JTextField addressField;
    private JTextField genderField;
    private JTextField insuranceProviderField;
    private JTextField policyNumberField;
    private JButton RegisterButton;
    private JButton CleanButton;
    private AppController controller;


    public MainFrame() {
        setTitle("Patient Registration Form");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        controller = new AppController();

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 20, 50, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(80, 20, 180, 25);
        add(nameField);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(20, 60, 50, 25);
        add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(80, 60, 180, 25);
        add(ageField);

        JLabel phoneLabel = new JLabel("Phone" );
        phoneLabel.setBounds(20, 100, 50, 25);
        add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(80, 100, 180, 25);
        add(phoneField);

        JLabel emailLabel = new JLabel("Email" );
        emailLabel.setBounds(20, 140, 50, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(80, 140, 180, 25);
        add(emailField);

        JLabel addressLabel = new JLabel("Address" );
        addressLabel.setBounds(20, 180, 180, 25);
        add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(80, 180, 180, 25);
        add(addressField);

        JLabel genderLabel = new JLabel("Gender" );
        genderLabel.setBounds(20, 220, 180, 25);
        add(genderLabel);

        genderField = new JTextField();
        genderField.setBounds(80, 220, 180, 25);
        add(genderField);

        JLabel insuranceProviderLabel = new JLabel("Insurance" );
        insuranceProviderLabel.setBounds(20, 260, 180, 25);
        add(insuranceProviderLabel);

        insuranceProviderField = new JTextField();
        insuranceProviderField.setBounds(80, 260, 180, 25);
        add(insuranceProviderField);

        JLabel policyNumberLabel = new JLabel("Policy #" );
        policyNumberLabel.setBounds(20, 300, 180, 25);
        add(policyNumberLabel);

        policyNumberField = new JTextField();
        policyNumberField.setBounds(80, 300, 180, 25);
        add(policyNumberField);

        RegisterButton = new JButton("Register");
        RegisterButton.setBounds(30, 340, 100, 30);
        add(RegisterButton);

        RegisterButton.addActionListener(e -> {
            controller.register(nameField.getText(), ageField.getText(), phoneField.getText(), emailField.getText(), addressField.getText(), genderField.getText(), insuranceProviderField.getText(), policyNumberField.getText());
        });

        CleanButton = new JButton("Clean");
        CleanButton.setBounds(150, 340, 100, 30);
        add(CleanButton);

        CleanButton.addActionListener(e -> clean());

        setVisible(true);
    }
    public void clean() {
        nameField.setText("");
        ageField.setText("");
        phoneField.setText("");
        emailField.setText("");
        addressField.setText("");
        genderField.setText("");
        insuranceProviderField.setText("");
        policyNumberField.setText("");
    }
}
