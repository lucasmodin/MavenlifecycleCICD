package org.example.mavenlifecyclecicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    void testAddPositiveNumbers() {
        // Tester at metoden add() giver korrekt resultat
        int result = App.add(2, 3);
        assertEquals(5, result, "2 + 3 skal være 5");
    }

    @Test
    void testAddWithZero() {
        int result = App.add(0, 7);
        assertEquals(7, result, "0 + 7 skal være 7");
    }

}