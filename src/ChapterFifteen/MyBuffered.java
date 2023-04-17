package ChapterFifteen;

import java.io.*;

public class MyBuffered {
    public static void main(String[] args) throws IOException {
//        String [] names = {"Michael", "John", "Joshua", "Jerry"};
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//        writer.write("Writing to a file");
//        for (String name:names) {
//            writer.write("\n"+ name);
//        }
//        writer.close();


        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
