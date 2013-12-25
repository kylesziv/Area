package ZipcodeTest;

import Zipcode.Zipcode;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class ZipcodeTest {

    @Test
    public void testToRegion() {
        assertEquals("Pittsburgh, PA", Zipcode.toRegion("15217"));
    }

    @Test
    public void testToLatitudeLongitude() {
        ArrayList<String> latitudeLongitude = new ArrayList<String>();

        latitudeLongitude.add("40.430919");
        latitudeLongitude.add("-79.92569");

        assertEquals(latitudeLongitude, Zipcode.toLatitudeLongitude("15217"));
    }

    @Test
    public void testToLatitude() {
        assertEquals("40.430919", Zipcode.toLatitude("15217"));
    }

    @Test
    public void testToLongitude() {
        assertEquals("-79.92569", Zipcode.toLongitude("15217"));
    }

    @Test
    public void testToGMTOffset() {
        assertEquals("-5", Zipcode.toGMTOffset("15217"));
    }

    @Test
    public void testObservesDST() {
        assertEquals(true, Zipcode.observesDST("15217"));
    }

}
