import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactBookTest {

    @Test
    public void newFind(){
        Contact contact = new Contact();
        contact.getFirstName();
        assertEquals(contact.getFirstName(), firstName);

    }

}