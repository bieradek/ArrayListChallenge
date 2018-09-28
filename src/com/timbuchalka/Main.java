package com.timbuchalka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        MobilePhone iPhone = new MobilePhone("Apple", "iPhone XS");
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To store a contact name");
        System.out.println("\n 2 - To modify a contact name");
        System.out.println("\n 3 - To remove a contact name.");
        System.out.println("\n 4 - To query for a contact name");
        System.out.println("\n 5 - To quit the application.");
    }
}

//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//        while (!quit) {
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0: //0 - To print choice options.
//                    printInstructions();
//                    break;
//                case 1: //1 - To add a contact.
//                    MobilePhone.addContact();
//                    break;
//                case 2: //2 - To modify a contact.
//                    MobilePhone.modifyContact();
//                    break;
//                case 3: //3 - To remove a contact.
//                    MobilePhone.removeContact();
//                    break;
//                case 4: //4 - To remove a contact.
//                    MobilePhone.queryContact();
//                    break;
//                case 5: //5 - To quit the application.
//                    quit = true;
//                    break;
//                default:
//                    System.out.println("Invalid choice, try again");
//                    break;
//            }
//        }
//    }