package se.iths.contact;

import java.util.ArrayList;

public class ContactBook {
    private ArrayList<Contact> myContacts;

    public ContactBook(){
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getFirstName()) >=0) {
            System.out.println("The contact is already saved.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(String contactFirstName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getFirstName().equals(contactFirstName)) {
                return i;
            }
        }
        return -1;
    }

    public void listContacts(){
        System.out.println("Contactlist: ");

        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i + 1) + ".	 First name: " +
                    this.myContacts.get(i).getFirstName() + "\n\t Last name:  " +
                    this.myContacts.get(i).getLastName() + "\n\t E-mail:     " +
                    this.myContacts.get(i).getEmail());
        }
    }
    public void printContact(String firstName){
        int indexPosition = findContact(firstName);
        System.out.println("\t First name: " +
                this.myContacts.get(indexPosition).getFirstName() + "\n\t Last name:  " +
                this.myContacts.get(indexPosition).getLastName() + "\n\t E-mail:     " +
                this.myContacts.get(indexPosition).getEmail());

    }

    public void delete(String firstName){
        int index = findContact(firstName);
        if(index != -1){
            myContacts.remove(index);
        }
        else{
            System.out.println("Could not find " + firstName + " in list of contacts");
        }
    }

    public int len(){
        return myContacts.size();
    }

}