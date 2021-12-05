package de.exxcellent.challenge;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class workWithCSV implements Reader {
    public List<String[]> read(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        List<String[]> allLines = new ArrayList<>();
        CSVReader openCSVReader = new CSVReader(fileReader);
        String[] value;
        while ((value = openCSVReader.readNext()) != null) {
            String[] line = new String[value.length];
            int i = 0;
            for (String token : value) {
                line[i] = token;
                i++;
            }
            allLines.add(line);
        }
        return allLines;
    }

    public void printCSV(List<String[]> cSVValues) {
        for (String[] line : cSVValues) {
            for (String token : line) {
                System.out.println(token);
            }
        }
    }

}
