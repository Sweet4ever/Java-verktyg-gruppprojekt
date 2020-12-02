package se.iths.contact;

import org.junit.jupiter.api.Test;
import se.iths.contact.Contact;
import se.iths.contact.ContactBook;

import static org.junit.jupiter.api.Assertions.*;

class ContactBookTest {

    @Test
    public void newFind(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), "Oskar");
    }

    @Test
    public void addContact(){
        ContactBook contactBook = new ContactBook();
        Contact newContact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        contactBook.addNewContact(newContact);
        assertEquals(contactBook.len(), 1);
    }

    @Test
    public void removeContact(){
        ContactBook contactBook = new ContactBook();
        Contact newContact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        contactBook.addNewContact(newContact);
        contactBook.delete("Oskar");
        assertEquals(contactBook.len(), 0);
    }


}