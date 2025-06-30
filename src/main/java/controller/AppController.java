package controller;
import view.MainFrame;
import model.User;
import javax.swing.*;

public class AppController {
    public void register(String name, String ageText, String phone, String email, String address, String gender, String insurance, String policyNumber) {
        int age = Integer.parseInt(ageText);
        User user = new User(name, age, phone, email, address, gender, insurance, policyNumber);
        System.out.println("Patient: " + user.getName() + ", " + user.getAge() + ", " + user.getPhone() + ", " + user.getEmail() + ", " + user.getAddress() + ", " + user.getGender() + ", " + user.getInsurance() + "," + user.getPolicyNumber());
    }
}