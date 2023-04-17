package ChapterFifteen;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Files {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("a:/b/c/../../");
//        Path path1 = Path.of("C:\\Users\\DELL\\Desktop\\Michael\\IdeaProjects\\theSeedProjects\\src\\ChapterFifteen\\myFile.txt");
//        Path path1 = Path.of("myNewFile.txt");
//        Path fileDirectory = java.nio.file.Files.createFile(path1);
//        System.out.println(fileDirectory.getFileName());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myNewFile.txt"));
        bufferedWriter.write("I am just writing");

        Runnable runnable = System.out::println;

//        Path filePath = java.nio.file.Files.createFile(path1);


//        Files.createFile(path1, new Fi;leAttribute<?>[0]);

//
//        System.out.println("fileName:: "+path1.getFileName());
//        System.out.println("fileSystem:: "+path1.getFileSystem());
//        System.out.println("normal path:: "+path1.normalize());
//        System.out.println("root:: "+path1.getRoot());
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));

//        C:\Users\DELL\Desktop\Michael\IdeaProjects\theSeedProjects\src\FactoryMethods\Factory.java


    }
}
