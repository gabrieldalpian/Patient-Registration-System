package model;

public class User {
    private String name;
    private int age;
    private String phone;
    private String email;
    private String address;
    private String gender;
    private String insurance;
    private String policyNumber;

    public User(String name, int age, String phone, String email, String address, String gender, String insurance, String policyNumber) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.insurance = insurance;
        this.policyNumber = policyNumber;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getGender() {
        return gender;
    }
    public String getInsurance() {
        return insurance;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
}

