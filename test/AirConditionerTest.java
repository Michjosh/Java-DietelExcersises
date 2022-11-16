import org.junit.jupiter.api.Test;
import tdd.AirConditioner;
import tdd.AirConditionerTemp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    //Given that I have an AC
    //My AC is off

    @Test
    public void AirConditionerOn() {
        AirConditioner powerOn = new AirConditioner();
        powerOn.setAcOn(powerOn.setAcOn());
        assertFalse(powerOn.setAcOn());
    }

    @Test
    public void AirConditionerOff() {
        AirConditioner powerOn = new AirConditioner();
        AirConditioner powerOff = new AirConditioner();
        powerOff.setAcOff();
        assertFalse(powerOff.setAcOff());
    }

    @Test
    public void AirConditionerTempIncrease() {
        AirConditioner powerOn = new AirConditioner();
        AirConditioner IncreaseTemp = new AirConditionerTemp();
        int increaseTemp = AirConditioner.increaseTemp;
    }

    void assertTrue(int increaseTemp) {
    }

    @Test
    public void AirConditionerTempDecrease() {
        AirConditioner powerOn = new AirConditioner();
        AirConditioner decreaseTemp = new AirConditionerTemp();
        int decreaseTemp1 = AirConditioner.decreaseTemp;
    }

    @Test
    public void AirConditionTempAbove30() {
        AirConditioner powerOn = new AirConditioner();
        int increaseTempAbove30 = setIncreaseTemp();

    }

    private int setIncreaseTemp() {
        return 0;
    }
}



    



