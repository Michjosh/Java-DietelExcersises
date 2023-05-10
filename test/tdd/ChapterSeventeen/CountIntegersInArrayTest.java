package ChapterSeventeen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountIntegersInArrayTest {

    @Test
    void countIntegersTest(){
        assertEquals(10, CountIntegersInArray.countIntegers(new String[]{"Ab1396", "Q2RBS", "G381a88c"}));
    }
}