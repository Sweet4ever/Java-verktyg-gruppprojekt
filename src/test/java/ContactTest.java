//package se.iths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    void newContact(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), "Oskar");
    }

    @Test
    void removeContact(){
        // ska läggas till
    }

}