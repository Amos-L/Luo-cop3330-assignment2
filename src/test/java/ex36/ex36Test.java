package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex36Test {

    @Test
    void average() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(400.0, ex36.average(numbers));
    }

    @Test
    void max() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(1000, ex36.max(numbers));
    }

    @Test
    void min() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(200, ex36.min(numbers));
    }

    @Test
    void standardD() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(353.55, ex36.standardD(numbers));
    }
}