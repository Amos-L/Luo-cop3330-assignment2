package org.example.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24Test {

    @Test
    void main() {
        assertEquals(true, ex24.AnagramTest("note","tone"));
        assertEquals(true, ex24.AnagramTest("cat","tac"));
        assertEquals(false, ex24.AnagramTest("pat","tone"));
    }

}