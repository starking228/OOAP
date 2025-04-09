package Lab3.Lab3_2;

import java.io.FileWriter;
import java.io.IOException;

class SortLogger {
    private static SortLogger instance;
    private static final String FILE_NAME = "assets/sort_times.txt";

    private SortLogger() {}

    public static synchronized SortLogger getInstance() {
        if (instance == null) {
            instance = new SortLogger();
        }
        return instance;
    }

    public synchronized void log(String sortType, long timeTaken) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(sortType + ": " + timeTaken + " ms\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
