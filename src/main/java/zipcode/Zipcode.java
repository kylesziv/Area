package zipcode;

import java.util.ArrayList;
import area.*;


public class Zipcode {

    public static String toRegion(String zip) {
        ArrayList<String> codes = Area.zipcodes.get(zip);
        String city = codes.get(1);
        String state = codes.get(2);

        return city + ", " + state;
    }

    public static ArrayList<String> toLatitudeLongitude(String zip) {
        ArrayList<String> codes = Area.zipcodes.get(zip);
        String latitude = codes.get(3);
        String longitude = codes.get(4);
        ArrayList<String> latitudeLongitude = new ArrayList<String>();

        latitudeLongitude.add(latitude);
        latitudeLongitude.add(longitude);

        return latitudeLongitude;
    }


    public static String toLatitude(String zip) {
        ArrayList<String> codes = Area.zipcodes.get(zip);
        String latitude = codes.get(3);

        return latitude;
    }

    public static String toLongitude(String zip) {
        ArrayList<String> codes = Area.zipcodes.get(zip);
        String longitude = codes.get(4);

        return longitude;
    }

    public static String toGMTOffset(String zip) {
        ArrayList<String> codes = Area.zipcodes.get(zip);
        String gmtOffset = codes.get(5);

        return gmtOffset;
    }

    public static String observesDST(String zip) {
        ArrayList<String> codes = Area.zipcodes.get(zip);
        String observesDST = codes.get(6);

        return observesDST;
    }

}
