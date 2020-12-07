package se.iths.writeAndRead;

import org.junit.jupiter.api.Test;
import se.iths.contact.Contact;
import se.iths.contact.ContactBook;

import static org.junit.jupiter.api.Assertions.*;

class WriteAndReadFromFileTest {
    // Test av ReadFromFile och WriteToFile
    @Test
    void saveAndLoadObjectToFile() {
        ContactBook contactSaveFile = new ContactBook();
        contactSaveFile = ReadFromFile.readContactFromFile();

        //Testlist created for this test
        ContactBook TestContactBook = new ContactBook();
        ContactBook ReadContactBook = new ContactBook();

        //Create test object and adds it to a contactbook list
        Contact myWriter = new Contact("Oskar", "Pilborg","oskar.pilborg@mail.com");
        TestContactBook.addNewContact(myWriter);
        WriteAndReadFromFile.writeObjectToFile(TestContactBook);
        ReadContactBook = ReadFromFile.readContactFromFile();

        assertEquals(TestContactBook.myContacts.size(),ReadContactBook.myContacts.size());

        for(int i=0; i<TestContactBook.myContacts.size(); i++) {
            String firstName = TestContactBook.myContacts.get(i).getFirstName();
            String lastName = TestContactBook.myContacts.get(i).getLastName();
            String mail = TestContactBook.myContacts.get(i).getEmail();

            assertEquals(ReadContactBook.myContacts.get(i).getFirstName(), firstName);
            assertEquals(ReadContactBook.myContacts.get(i).getLastName(), lastName);
            assertEquals(ReadContactBook.myContacts.get(i).getEmail(), mail);
        }
        WriteAndReadFromFile.writeObjectToFile(contactSaveFile);
    }
}