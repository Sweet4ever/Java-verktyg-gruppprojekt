package se.iths.writeAndRead;

import se.iths.contact.Contact;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {

    public static void writeObjectToFile(Contact contact) {
        try {

            String firstName = contact.getFirstName();
            String lastName = contact.getLastName();
            String mail = contact.getEmail();

            FileWriter myWriter = new FileWriter("ContactSaveFile.txt");




            myWriter.write(firstName+"\n");
            myWriter.write(lastName+"\n");
            myWriter.write(mail+"\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}