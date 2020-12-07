package se.iths.terminal;

import se.iths.contact.*;
import se.iths.contact.ContactBook;
import se.iths.writeAndRead.ReadFromFile;
import se.iths.writeAndRead.WriteAndReadFromFile;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Terminal {
    //Add print menu metod och meny metod
    static Scanner scan = new Scanner(System.in);
    static ContactBook contactBook = new ContactBook();
    public static boolean exit = false;

    public static void main(String[] args) {
        Welcoming_Message();
        contactBook = ReadFromFile.readContactFromFile();

        while(!exit){
            Print_menu();
            System.out.println("Input: ");
            String input = scan.nextLine();

            ChoiceMethod(input);
            printBlankLine();
        }
    }

    private static void Print_menu(){
        System.out.println(
                        "Enter 1: List of contacts\n" +
                        "Enter 2: Add contact\n"+
                        "Enter 3: Remove contact\n"+
                        "Enter 4: To print a specific contact\n"+
                        "Enter 5: To exit");
    }
    private static void Welcoming_Message(){
        System.out.println("Welcome to Group 4's contact storage tool for all your storage needs");
    }

    public static void ChoiceMethod(String choice) {
        try{
            switch (choice) {
                case "1":
                    contactBook.listContacts();
                    break;

                case "2":
                    addNewContact();
                    break;

                case "3":
                    removeContact();
                    break;
                case "4":
                    printContact();
                    break;

                case "5":
                    System.out.println("Exiting program");
                    WriteAndReadFromFile.writeObjectToFile(contactBook);

                    exit = true;
                    break;
                default:
                    System.out.println("Your choice does not exist.");
                    TimeUnit.SECONDS.sleep(1);
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }

    }

    public static void addNewContact(){
        System.out.println("Enter first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter e-mail: ");
        String email = scan.nextLine();

        Contact newContact = new Contact(firstName, lastName, email);
        if(contactBook.addNewContact(newContact)) {
            System.out.println("New contact added: First name: " + firstName + ", Last name: " + lastName + ", E-mail: " +email);
        } else {
            System.out.println("Could not add. " + firstName + " already exist.");

        }
    }
    public static void removeContact(){
        System.out.println("Enter the first name of the contact to be removed: ");
        String firstname = scan.nextLine();
        contactBook.delete(firstname);
        System.out.println("Contact: " + firstname + " successfully deleted");
    }

    public static void printContact(){
        System.out.println("Enter the first name of the person to be printed: ");
        String firstName = scan.nextLine();
        contactBook.printContact(firstName);
    }
    private static void printBlankLine(){
        System.out.println("                                                                                                                                ");
    }
}
