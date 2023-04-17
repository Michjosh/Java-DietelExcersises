package ChapterFifteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Dictionary;

public class MyNIO {
public static void main(String[]args) {

    try {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\JavaFiles\\NIOutput.txt");
        FileChannel channel = inputStream.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(104);
        int result = channel.read(readBuffer);
        System.out.println("file content "+ result + " bytes");

        
//try{
//        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop\\JavaFiles\\NIOutput.txt");
//        FileChannel fileChannel = outputStream.getChannel();
//        ByteBuffer writer = ByteBuffer.allocate(1024);
//        String message = "This is a string literal";
//        writer.put(message.getBytes());
//        writer.flip();
//        fileChannel.write(writer);
////        System.out.println(writer);
//        System.out.println("Successful");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
