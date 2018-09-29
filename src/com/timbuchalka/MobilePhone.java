package com.timbuchalka;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private String brand;
    private String model;
    private ArrayList<String> contactList = new ArrayList<String>();

    public MobilePhone(String brand, String model, ArrayList<String> contactList) {
        this.brand = brand;
        this.model = model;
        this.contactList = contactList;
    }

    public static void addContact() {
        System.out.print("Please enter the contact name: ");
        contactList.add(scanner.nextLine());
//        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyContact() {
        System.out.println("Current item");
//        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeContact() {
        System.out.println("enter item number");
//        String itemNo = scanner.nextLine();
//        scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo);
    }

    public static void queryContact() {
        System.out.print("Item to search for: ");
//        String searchItem = scanner.nextLine();
//        if (groceryList.onFile(searchItem)) {
//            System.out.println("Found " + searchItem + " in our grocery list");
//        } else {
//            System.out.println(searchItem + " is not in the list");
//        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static ArrayList<Contacts> getContactList() {
        return contactList;
    }

    public static void setContactList(ArrayList<Contacts> contactList) {
        MobilePhone.contactList = contactList;
    }
}
