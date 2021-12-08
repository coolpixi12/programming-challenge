package de.exxcellent.challenge;

import java.util.List;

public class CSVCalculations implements Calculations {

    public String calculateLineOfSmallestDifference(List<String[]> csvValues, int columnMax, int columnMin) {
        int min = Integer.MAX_VALUE;
        String lineOfSmallestDifference = "";
        for (String[] line : csvValues.subList(1, csvValues.size())) {
            int maxValueColumn = Integer.parseInt(line[columnMax]);
            int minValueColumn = Integer.parseInt(line[columnMin]);
            int differenceOfMaxAndMin = calculateDifference(minValueColumn, maxValueColumn);
            if (differenceOfMaxAndMin < min) {
                min = differenceOfMaxAndMin;
                lineOfSmallestDifference = line[0];
            }
        }
        return lineOfSmallestDifference;
    }

    private int calculateDifference(int min, int max) {
        return Math.abs(max - min);
    }

}
