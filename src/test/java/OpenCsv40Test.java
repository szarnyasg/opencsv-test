import com.opencsv.CSVWriter;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class OpenCsv40Test {

    @Test
    public void hello() throws IOException {
        CSVWriter writer = new CSVWriter(
                new FileWriter("/tmp/my40.csv"),
                ',',
                CSVWriter.NO_QUOTE_CHARACTER,
                '\\'
                );
        // feed in your array (or convert your data to an array)
        String[] entries = "Foo Bar#Bar, F.#123".split("#");
        writer.writeNext(entries);
        writer.close();
    }

}
