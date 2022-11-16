import org.junit.jupiter.api.Test;
import tdd.Driller;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DrillerTest {

    @Test
    public void firstDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(1);
        assertEquals(2000, amount);

    }

    @Test
    public void SecondDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(10);
        assertEquals(16000, amount);
    }

    @Test
    public void thirdDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(15);
        assertEquals(24000, amount);
    }

    @Test
    public void fouthDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(35);
        assertEquals(52500, amount);
    }

    @Test
    public void fifthDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(55);
        assertEquals(71500, amount);
    }

    @Test
    public void sixthDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(105);
        assertEquals(126000, amount);
    }

    @Test
    public void seventhDrillerTest() {
        Driller utme = new Driller();
        int amount = utme.quantity(498);
        assertEquals(547800, amount);
    }
}