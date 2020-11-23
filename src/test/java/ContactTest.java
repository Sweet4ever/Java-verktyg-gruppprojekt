//package se.iths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    void newContact(){
        Contact contact = new Contact("Oskar", "Pilborg", "oskar.pilborg@mail.se");
        assertEquals(contact.getFirstName(), firstName);
    }

    //@Test
    //void testAdd() {
      //  Calculator calculator = new Calculator();
        //assertEquals(4, calculator.add(2, 2));
    //}
}