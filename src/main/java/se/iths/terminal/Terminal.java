package se.iths.terminal;

import se.iths.contact.ContactBook;

import java.util.Scanner;

public class Terminal {
    //Add print menu metod och meny metod
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Welcoming_Message();
        boolean exit = false;

        while(!exit){
            Print_menu();
            System.out.println("Input: ");
            int input = scan.nextInt();

            if(CheckInputIsWithinRange(input)){
                ChoiceMethod(input){

                }
            }

        }

    }


    private static void Print_menu(){
        System.out.println(
                "Enter 0: List of commands\n" +
                        "Enter 1: List of contacts\n" +
                        "Enter 2: Add contact\n"+
                        "Enter 3: Remove contact\n"+
                        "Enter 4: To search for a contact\n"+
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

    public void ChoiceMethod(int choice){
        switch (choice){
            case 0:
                Print_menu();
                break;

            case 1:
                
        }
    }
}
