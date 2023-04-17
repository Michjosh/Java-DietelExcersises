package ChapterFifteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileInputStream {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\JavaFiles\\input.txt");
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop\\JavaFiles\\output.txt");
            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print((char) content);
                outputStream.write(content);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
