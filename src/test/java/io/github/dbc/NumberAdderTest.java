package io.github.dbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAdderTest {

    private NumberAdder numberAdder;

    @BeforeEach
    void setUp() {
        numberAdder = new NumberAdder();
    }

    @Test
    void add() {
        assertEquals(3, numberAdder.add(1, 2));
    }

    @Test
    void add_with_negative_numbers() {
        assertEquals(3, numberAdder.add(-1, 2));
    }

    @Test
    void add_with_zero() {
        assertEquals(0, numberAdder.add(0, 0));
    }
}