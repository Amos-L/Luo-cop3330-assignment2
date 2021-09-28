package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ex27Test {

    @Test
    void checkInput() {
        assertEquals("There were no errors found.", ex27.checkInput("John","Johnson", "55555", "TK-4321"));
    }
}