package com.timbuchalka;

import java.util.ArrayList;

public class MobilePhone {
    private String brand;
    private String model;
    private static ArrayList<String> contactList = new ArrayList<String>();

    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static void addContact(String contactName, int contactNumber) {
        System.out.print("Please enter the contact details(name and number) item: ");
        contactList.add()
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
}
