package Region;

import java.util.ArrayList;


public class Region {

    private String Zipcode;
    private String City;
    private String State;
    private String Latitude;
    private String Longitude;
    private String GMTOffset;
    private String ObservesDST;

    public Region(String Zipcode, String City, String State, String Latitude, String Longitude, String GMTOffset, String ObservesDST) {

        this.Zipcode = Zipcode;
        this.City = City;
        this.State = State;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.GMTOffset = GMTOffset;
        this.ObservesDST = ObservesDST;

    }

    public String getZipcode() {
        return this.Zipcode;
    }

    public String getRegion() {
        return this.City + ", " + this.State;
    }

    public ArrayList<String> getLatitudeAndLongitude() {
        ArrayList<String> latitudeLongitude = new ArrayList<String>();

        latitudeLongitude.add(this.Latitude);
        latitudeLongitude.add(this.Longitude);

        return latitudeLongitude;
    }

    public String getLatitude() {
        return this.Latitude;
    }

    public String getLongitude() {
        return this.Longitude;
    }

    public String getGMTOffset() {
        return this.GMTOffset;
    }

    public Boolean observesDST() {
        Boolean observesDST = false;

        if(this.ObservesDST.equals("1")) {
            observesDST = true;
        }

        return observesDST;
    }

}
