package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex25Test {

    @Test
    void passwordChecker() {
        assertEquals(0, ex25.PasswordChecker("12345"));
        assertEquals(1, ex25.PasswordChecker("abcdef"));
        assertEquals(2, ex25.PasswordChecker("abc123xyz"));
        assertEquals(3, ex25.PasswordChecker("1337h@xor!"));
    }


}