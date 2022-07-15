package com.devAk;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (input != 0) {
            System.out.println("WELCOME TO THE ADDRESS BOOK!!!");
            System.out.println("------------------------------");
            System.out.println("Please choose from the following number that corresponds to a task:");
            System.out.println("1. Add a contact");
            System.out.println("2. Retrieve by phone number");
            System.out.println("3. Retrieve and update");
            System.out.println("4. Get all contacts");
            System.out.println("0. Exit");
            System.out.print("What would you like to do: ");
            try {
                input = scanner.nextInt();
                if(input > 0 && input < 5) {
                    switch (input) {
                        case 1: {
                            System.out.print("Please enter first name: ");
                            scanner.nextLine();
                            String firstname = scanner.nextLine();
                            System.out.print("Please enter last name: ");
                            String lastname = scanner.nextLine();
                            System.out.print("Please enter phone number: ");
                            String phone = scanner.nextLine();
                            System.out.print("Please enter email: ");
                            String email = scanner.nextLine();
                            System.out.println("Contact added successfully");
                            System.out.println("---------------------------------");

                            var contact = new Contact(firstname, lastname, phone, email);

                            for (int i = 0; i < contacts.length; i++) {
                                if (contacts[i] == null) {
                                    contacts[i] = contact;
                                    break;
                                }
                            }
                        }
                        break;

                        case 2: {
                            System.out.print("Please enter the phone number to get the contact: ");
                            scanner.nextLine();
                            String x = scanner.nextLine();

                            for (int i = 0; i < contacts.length; i++) {
                                try {
                                    if (x.equals(contacts[i].getPhoneNumber())) {
                                        contacts[i].getContact();
                                        break;
                                    }
                                } catch (Exception exc) {
                                    System.out.println("Contact not found");
                                    System.out.println("------------------");
                                    break;
                                }
                            }
                        }
                        break;


                        case 3: {
                            System.out.print("To update the email, please enter the phone number to get the contact: ");
                            scanner.nextLine();
                            String y = scanner.nextLine();
                            for (Contact c : contacts) {
                                try {
                                    if (y.equals(c.getPhoneNumber())) {
                                        c.getContact();
                                        System.out.print("\nEnter new email: ");
                                        String newEmail = scanner.nextLine();
                                        c.setEmail(newEmail);
                                        System.out.println("Email updated successfully!");
                                        System.out.println("----------------------------");
                                        break;
                                    }
                                } catch (Exception e) {
                                    System.out.println("No contact found with this number.");
                                    break;
                                }
                                ;
                            }
                        }
                        break;

                        case 4: {
                            for (Contact a : contacts) {
                                if (a == null) {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("Your address book is empty. Please enter 1 to add contacts.");
                                    System.out.println("------------------------------------------------------------");
                                    break;
                                } else  a.getContact();
                        } }
                        break;

                        case 0:
                            break;
                    }
                }else if(input == 0) System.out.println("Have a good one. See ya later!!");
                else {
                    System.out.println("Please choose from available numeric options. Thank you");
                    System.out.println("--------------------------------------------------------");
                }
            } catch (Exception e){
                System.out.println("Please choose from available numeric options. Thank you");
                System.out.println("--------------------------------------------------------");
                scanner.nextLine();
            }


        }
    }
}

