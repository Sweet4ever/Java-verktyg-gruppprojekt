package se.iths.writeAndRead;

import se.iths.contact.Contact;
import se.iths.contact.ContactBook;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFromFile {
    public static ContactBook readContactFromFile(){
        try{
            ContactBook contactBook = new ContactBook();
            File myObj = new File("ContactSaveFile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String firstName = myReader.nextLine();
                String lastName = myReader.nextLine();
                String mail = myReader.nextLine();

                Contact contactToAdd = new Contact(firstName,lastName,mail);
                contactBook.addNewContact(contactToAdd);

            }
            return contactBook;
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }

    }
}