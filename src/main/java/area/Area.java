package Area;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;

import Region.Region;


public class Area {

    public static HashMap<String, Region> zipcodes = new HashMap<String, Region>();

    static {
        loadCSV();
    }

    private static void loadCSV() {

        try {
            CsvReader zip = new CsvReader("src/main/resources/zipcodes.csv");
            zip.readHeaders();

            while(zip.readRecord()) {

                Region currentRegion = new Region(
                        zip.get("Zipcode"), zip.get("City"), zip.get("State"), zip.get("Latitude"),
                        zip.get("Longitude"), zip.get("GMT"), zip.get("DST")
                );

                zipcodes.put(zip.get("Zipcode"), currentRegion);
            }

            zip.close();
        } catch(FileNotFoundException e) {
            System.out.println("This failed");
        } catch(IOException e) {
            System.out.println("This was failed 2");
        }
    }
}
