package se.iths.contact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactBookTest {

    @Test
    public void newFind(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        contact.getFirstName();
        assertEquals(contact.getFirstName(), "Oskar");
    }

    @Test
    public void addContact(){
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contactBook.len(), 1);
    }

    @Test
    public void removeContact(){
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        contactBook.delete("Oskar");
        assertEquals(contactBook.len(), 0);
    }


}