package ZipcodeHashTest;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

import Zipcode.ZipcodeHash;


public class ZipcodeHashTest {

    @Test
    public void testToRegion() {
        assertEquals("Pittsburgh, PA", ZipcodeHash.toRegion("15217"));
    }

    @Test
    public void testToLatitudeLongitude() {
        ArrayList<String> latitudeLongitude = new ArrayList<String>();

        latitudeLongitude.add("40.430919");
        latitudeLongitude.add("-79.92569");

        assertEquals(latitudeLongitude, ZipcodeHash.toLatitudeLongitude("15217"));
    }

    @Test
    public void testToLatitude() {
        assertEquals("40.430919", ZipcodeHash.toLatitude("15217"));
    }

    @Test
    public void testToLongitude() {
        assertEquals("-79.92569", ZipcodeHash.toLongitude("15217"));
    }

    @Test
    public void testToGMTOffset() {
        assertEquals("-5", ZipcodeHash.toGMTOffset("15217"));
    }

    @Test
    public void testObservesDST() {
        assertEquals(true, ZipcodeHash.observesDST("15217"));
    }

}
