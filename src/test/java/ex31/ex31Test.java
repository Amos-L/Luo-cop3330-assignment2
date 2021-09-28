package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31Test {

    @Test
    void findHeartRate() {
        //Value expected needs to be rounded
        assertEquals(138.15,ex31.findHeartRate(.55,22,65));
    }
}