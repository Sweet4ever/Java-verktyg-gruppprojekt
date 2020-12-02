package se.iths.contact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void newContact(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), "Oskar");
    }
}