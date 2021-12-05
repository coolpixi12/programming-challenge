package de.exxcellent.challenge;

import java.util.List;

public class CSVCalculations implements Calculations{

    private int calculateSmallestTemperatureSpread(int min, int max) {
        return max-min;
    }

    public int calculateDayOfSmallestTemperatureSpread(List<String[]> csvValues){
        int min  = Integer.MAX_VALUE;
        int day = 0;
        int smallestTemperatureSpreadDay = 0;
        for (String[] dayValues : csvValues.subList(1, csvValues.size())) {
            day ++;
            int maxDayTemperature = Integer.parseInt(dayValues[1]);
            int minDayTemperature = Integer.parseInt(dayValues[2]);
            int temperatureSpread = calculateSmallestTemperatureSpread(maxDayTemperature, minDayTemperature);
            if(temperatureSpread < min){
                min = temperatureSpread;
                smallestTemperatureSpreadDay = day;
            }
        }
        return smallestTemperatureSpreadDay;
    }

}
