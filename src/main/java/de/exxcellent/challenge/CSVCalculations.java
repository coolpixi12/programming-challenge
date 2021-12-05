package de.exxcellent.challenge;

import java.util.List;

public class CSVCalculations implements Calculations{

    private int calculateSmallestTemperatureSpread(int min, int max) {
        return max-min;
    }

    public String calculateDayOfSmallestTemperatureSpread(List<String[]> csvValues){
        int min  = Integer.MAX_VALUE;
        String smallestTemperatureSpreadDay = "";
        for (String[] dayValues : csvValues.subList(1, csvValues.size())) {
            int maxDayTemperature = Integer.parseInt(dayValues[1]);
            int minDayTemperature = Integer.parseInt(dayValues[2]);
            int temperatureSpread = calculateSmallestTemperatureSpread(minDayTemperature, maxDayTemperature);
            if(temperatureSpread < min){
                min = temperatureSpread;
                smallestTemperatureSpreadDay = dayValues[0];
            }
        }
        return smallestTemperatureSpreadDay;
    }

}
