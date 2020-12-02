package se.iths.terminal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {

    @Test
    void checkInputIsWithinRange() {
        for(int i=1; i<6; i++ ) {
            assertTrue(Terminal.CheckInputIsWithinRange(i));
        }
        int negativeNumber = -1;
        assertFalse(Terminal.CheckInputIsWithinRange(negativeNumber));
        int BigNumber = 6;
        assertFalse(Terminal.CheckInputIsWithinRange(BigNumber));
            }
}