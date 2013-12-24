package area;


import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;


/**
 * Created by kyleszives on 12/24/13.
 */
public class Area {

    public static HashMap<String, ArrayList> zipcodes = new HashMap<String, ArrayList>();

    static {
        loadCSV();
    }

    private static void loadCSV() {

        try {
//            CsvReader zip = new CsvReader("/Users/kyleszives/Area/src/main/resources/zipcodes.csv");
            CsvReader zip = new CsvReader("src/main/resources/zipcodes.csv");
            zip.readHeaders();

            while(zip.readRecord()) {

                String zipcode = zip.get("Zipcode");
                String city = zip.get("City");
                String state = zip.get("State");
                String latitude = zip.get("Latitude");
                String longitude = zip.get("Longitude");
                String gmtOffset = zip.get("GMT");
                String dst = zip.get("DST");

                ArrayList<String> codeData = new ArrayList<String>();

                codeData.add(zipcode);
                codeData.add(city);
                codeData.add(state);
                codeData.add(latitude);
                codeData.add(longitude);
                codeData.add(gmtOffset);
                codeData.add(dst);

                zipcodes.put(zipcode, codeData);
            }

            zip.close();
        } catch(FileNotFoundException e) {
            System.out.println("This failed");
        } catch(IOException e) {
            System.out.println("This was failed 2");
        }
    }
}
