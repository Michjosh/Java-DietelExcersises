package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tdd.AutomaticBike.setGearOne;

public class AutomaticBikeTest {

    @Test
    public void AutomaticBikeTestOnTest() {
        AutomaticBike powerOn = new AutomaticBike();
        assertTrue(powerOn.setBikeOn(powerOn));
    }

    @Test
    public void AutomaticBikeOffTest() {
        AutomaticBike powerOn = new AutomaticBike();
        AutomaticBike powerOff = new AutomaticBike();
        assertFalse(powerOff.setBikeOff(powerOff));
    }

     @Test
     public void AutomaticBikeAcceleratedGearOneTest() {
     AutomaticBike powerOn = new AutomaticBike();
     AutomaticBike gearOne = new AutomaticBike();
     AutomaticBike.setGearOne();
     assertEquals(AutomaticBike.setGearOne());
   }
    private void assertEquals(int setGearOne) {
}

    @Test
    public void AutomaticBikeAcceleratedGearTwoTest() {
        AutomaticBike powerOn = new AutomaticBike();
        AutomaticBike gearTwo = new AutomaticBike();
        AutomaticBike.setGearTwo();
        assertEquals(AutomaticBike.setGearTwo());

    }

    @Test
    public void AutomaticBikeAcceleratedGearThreeTest() {
        AutomaticBike powerOn = new AutomaticBike();
        AutomaticBike gearThree = new AutomaticBike();
        AutomaticBike.setGearThree();
        assertEquals(AutomaticBike.setGearThree());
    }

    @Test
    public void AutomaticBikeAcceleratedGearFourTest() {
        AutomaticBike powerOn = new AutomaticBike();
        AutomaticBike gearThree = new AutomaticBike();
        AutomaticBike.setGearFour();
        assertEquals(AutomaticBike.setGearFour());
    }

}

