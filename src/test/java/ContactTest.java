import main.java.Contact;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    void newContact(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), "Oskar");
    }
}