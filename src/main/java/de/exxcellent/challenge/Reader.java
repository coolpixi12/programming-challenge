package de.exxcellent.challenge;

import java.io.IOException;
import java.util.List;

public interface Reader {
    List<String[]> read(String filepath) throws IOException;
}
