package se.iths.contact;

import org.junit.Test;
import se.iths.contact.Contact;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    public void newContact(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), "Oskar");
    }
}