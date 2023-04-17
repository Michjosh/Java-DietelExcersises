package ChapterFifteen;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class CatSerialize {

    public static String objToJason(Cat cat){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        objectMapper.setDateFormat(dateFormat);


        try {
            return objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Cat JsonToObj(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
