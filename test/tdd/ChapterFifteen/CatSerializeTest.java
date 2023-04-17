package ChapterFifteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializeTest {

    Cat cat;
    String jsonCat;

    @BeforeEach
    public void setUp(){
        cat = new Cat("Tom", 20);
        cat.setDateOfBirth(LocalDateTime.now());
        jsonCat = "{\"name\":\"Tom\",\"age\":20}";
    }

    @Test
    public void testConvertCatToJson(){
        String catJason = CatSerialize.objToJason(cat);
        assertNotNull(catJason);
        String dateTime = String.valueOf(LocalDateTime.now());
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+dateTime+"\""+"}", catJason);

    }

    @Test
    void testConvertJsonToCat() {
        Cat cat1 = CatSerialize.JsonToObj(jsonCat);
        assertNotNull(cat1);
    }

}