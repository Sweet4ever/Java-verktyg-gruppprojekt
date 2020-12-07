package se.iths.writeAndRead;

import se.iths.contact.Contact;
import se.iths.contact.ContactBook;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteAndReadFromFile {

    public static void writeObjectToFile(ContactBook contactBook) {
        try {
            FileWriter myWriter = new FileWriter("ContactSaveFile.txt");

            for(int i=0; i<contactBook.myContacts.size(); i++){
                String firstName = contactBook.myContacts.get(i).getFirstName();
                String lastName = contactBook.myContacts.get(i).getLastName();
                String mail = contactBook.myContacts.get(i).getEmail();

                myWriter.write(firstName+"\n");
                myWriter.write(lastName+"\n");
                myWriter.write(mail+"\n");

            }
            myWriter.close();
            System.out.println("Successfully saved contacts to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}