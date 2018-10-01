package com.timbuchalka;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String brand;
    private String model;

    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.myContacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) { // we're using the method which accepts String as a parameter
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) { //in this moment we are initializing two new variables, therefore a constructor is called
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted");
        return true;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact); // return the position of the element
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) { //loop through whole ArrayList
            Contact contact = this.myContacts.get(i); // on each iteration assign value of each element of the ArrayList i.e. {John,Martin,Elizabeth,Radek} so get(0) would be contact = 'John"
            if (contact.getName().equals(contactName)) { // if contact's name(first field) is equal to John, return position of the contact on the ArrayList
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
}
