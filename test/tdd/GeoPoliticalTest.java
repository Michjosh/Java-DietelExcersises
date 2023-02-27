import ChapterEight.GeoPoliticalZones;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GeoPoliticalTest {

    @Test
    public void testThatStateAreInAGeopoliticalZOne(){
        GeoPoliticalZones zone = GeoPoliticalZones.getState("Anambra");
        System.out.println(zone);
        assertEquals(GeoPoliticalZones.SOUTH_EAST, zone);
    }

}
