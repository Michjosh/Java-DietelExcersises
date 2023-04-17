package ChapterFifteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Michael\\IdeaProjects\\theSeedProjects\\src\\ChapterFifteen\\myFile.txt"))) {
            while (input.hasNext()){
                String words = input.nextLine();
                System.out.println(words);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
