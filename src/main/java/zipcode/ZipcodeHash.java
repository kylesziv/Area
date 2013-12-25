package Zipcode;

import Area.Area;
import Region.Region;

import java.util.ArrayList;


public class ZipcodeHash {

    public static String toRegion(String zip) {
        Region currentRegion = Area.zipcodes.get(zip);
        return currentRegion.getRegion();
    }

    public static ArrayList<String> toLatitudeLongitude(String zip) {
        Region currentRegion = Area.zipcodes.get(zip);
        return currentRegion.getLatitudeAndLongitude();
    }


    public static String toLatitude(String zip) {
        Region currentRegion = Area.zipcodes.get(zip);
        return currentRegion.getLatitude();
    }

    public static String toLongitude(String zip) {
        Region currentRegion = Area.zipcodes.get(zip);
        return currentRegion.getLongitude();
    }

    public static String toGMTOffset(String zip) {
        Region currentRegion = Area.zipcodes.get(zip);
        return currentRegion.getGMTOffset();
    }

    public static Boolean observesDST(String zip) {
        Region currentRegion = Area.zipcodes.get(zip);
        return currentRegion.observesDST();
    }

}
