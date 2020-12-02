package se.iths.contact;

import java.util.ArrayList;

public class ContactBook {
    private ArrayList<Contact> myContacts;

    public ContactBook(){
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        try {
            if (findContact(contact.getFirstName()) >= 0) {
                System.out.println("Kontakten är redan sparad.");
                return false;
            }
            myContacts.add(contact);
            return true;
        }
        catch (Exception e) {
            System.out.println("Execption addNewContact: " + e);
            return false;
        }
    }

    private int findContact(String contactFirstName){
        try {
            for (int i = 0; i < this.myContacts.size(); i++) {
                Contact contact = this.myContacts.get(i);
                if (contact.getFirstName().equals(contactFirstName)) {
                    return i;
                }
            }
            return -1;
        }
        catch (Exception e) {
            System.out.println("Execption findContact: " + e);
            return -1;
        }
    }

    public void listContacts(){
        try {
            System.out.println("Contactlist: ");

            for (int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + ".	 First name: " +
                        this.myContacts.get(i).getFirstName() + "\n\t Last name:  " +
                        this.myContacts.get(i).getLastName() + "\n\t E-mail:     " +
                        this.myContacts.get(i).getEmail());
            }
        }
        catch (Exception e) {
            System.out.println("Execption listContact: " + e);
        }
    }
    public void printContact(String firstName){
        try {
            int indexPosition = findContact(firstName);
            System.out.println("\t First name: " +
                    this.myContacts.get(indexPosition).getFirstName() + "\n\t Last name:  " +
                    this.myContacts.get(indexPosition).getLastName() + "\n\t E-mail:     " +
                    this.myContacts.get(indexPosition).getEmail());
        }
        catch (Exception e) {
            System.out.println("Execption printContact: " + e);
        }
    }

    public void delete(String firstName){
        try {
            int index = findContact(firstName);
            if (index != -1) {
                myContacts.remove(index);
            } else {
                System.out.println("Could not find " + firstName + " in list of contacts");
            }
        }
        catch (Exception e) {
            System.out.println("Execption delete: " + e);
        }
    }

    public int len(){
        return myContacts.size();
    }
}