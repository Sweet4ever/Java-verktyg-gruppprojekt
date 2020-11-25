//package se.iths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    void newContact(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), "Oscar");
    }

    //@Test
    //void testAdd() {
      //  Calculator calculator = new Calculator();
        //assertEquals(4, calculator.add(2, 2));
    //}
}