package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVCalculationsTest {
    CSVCalculations calculations = new CSVCalculations();

    @Test
    void calculateMinToMax() {
        assertEquals(2, calculations.calculateMinToMax(3, 5));
    }
}