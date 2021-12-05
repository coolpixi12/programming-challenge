package de.exxcellent.challenge;

import java.io.IOException;
import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) throws IOException {
        String filePath = "./src/main/resources/de/exxcellent/challenge/weather.csv";
        ReaderForCSV readerForCSV = new ReaderForCSV();
        List<String[]> csvValues = readerForCSV.read(filePath);
        //readerForCSV.printCSV(cSVValues);
        Calculations calculate = new CSVCalculations();
        String dayWithSmallestTempSpread = calculate.calculateDayOfSmallestTemperatureSpread(csvValues);

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
