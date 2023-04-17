package Practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {

    @Test
    void getDivisors() {
        int number = 100;
        int [] numb = {2,2,5,5};
        assertEquals(Arrays.toString(numb), Arrays.toString(Lcm.getLcmDivisors(number)));
    }
}