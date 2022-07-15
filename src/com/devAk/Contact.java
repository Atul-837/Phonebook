package com.devAk;

public class Contact {
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.PhoneNumber = phoneNumber;
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void getContact(){
        System.out.println("--------------------------------");
        System.out.println("First Name: " + this.FirstName);
        System.out.println("Last Name: " + this.LastName);
        System.out.println("Phone: " + this.PhoneNumber);
        System.out.println("Email: " + this.email);
        System.out.println("--------------------------------");
    }

    public void setEmail(String email){
        this.email = email;
    }
}
