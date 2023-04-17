package ChapterFifteen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MyFileCharacterStream  {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("C:\\Users\\DELL\\Desktop\\JavaFiles\\Input.txt");
            writer = new FileWriter("C:\\Users\\DELL\\Desktop\\JavaFiles\\Output.txt");
            int content;
            List <Integer> mybyte = new ArrayList<>();
            while ((content = reader.read()) != -1) {
                mybyte.add(content);
                writer.append((char) content);
            }
            System.out.println(mybyte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing reader: " + ex.getMessage());
            }

            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing writer: " + ex.getMessage());
            }
        }

    }
}
