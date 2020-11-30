package se.iths.terminal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {

    @Test
    void checkInputIsWithinRange() {
        int number = 6;
        assertTrue(Terminal.CheckInputIsWithinRange(number));
    }
}