package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CSVCalculationsTest {
    CSVCalculations calculations = new CSVCalculations();
    String[] testLine1 = {"A", "B", "C"};
    String[] testLine2 = {"1", "90", "10"};
    String[] testLine3 = {"2", "10", "5"};
    List<String[]> testList = new ArrayList<>();


    @Test
    void calculateLineOfSmallestDifferenceTestChoose2() {
        testList.add(testLine1);
        testList.add(testLine2);
        testList.add(testLine3);
        assertEquals("2", calculations.calculateLineOfSmallestDifference(testList, 1, 2));
    }
    @Test
    void calculateLineOfSmallestDifferenceTestChoose1() {
        testList.add(testLine1);
        testList.add(testLine2);
        assertEquals("1", calculations.calculateLineOfSmallestDifference(testList, 1, 2));
    }

    @Test
    void calculateLineOfSmallestDifferenceTestNoCalculationLines() {
        testList.add(testLine1);
        assertEquals("", calculations.calculateLineOfSmallestDifference(testList, 1, 2));
    }
}