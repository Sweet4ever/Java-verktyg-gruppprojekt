package se.iths.terminal;

import se.iths.contact.*;
import java.util.Scanner;

public class Terminal {
    //Add print menu metod och meny metod
    static Scanner scan = new Scanner(System.in);
    static ContactBook contactBook = new ContactBook();

    public static void main(String[] args) {
        Welcoming_Message();
        Print_menu();
        int input = scan.nextInt();

        CheckInputIsWithinRange(input);

    }

    private static void Print_menu(){
        System.out.println(
                "Enter 0: List of commands\n" +
                        "Enter 1: List of contacts\n" +
                        "Enter 2: Add contact\n"+
                        "Enter 3: Remove contact"+
                        "Enter 4: To search for a contact"+
                        "Enter 5: To exit");
    }
    private static void Welcoming_Message(){
        System.out.println("Welcome to Group 4's contact storage tool for all your storage needs");
    }
    public static boolean CheckInputIsWithinRange(int input){
        if((input>=0) && (input<=5)){
            return true;
        }
        else{
            System.out.println("Input: "+input+ " is out of bounds, please enter a valid number.");
            return false;
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
}
