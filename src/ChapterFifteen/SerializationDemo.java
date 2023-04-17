package ChapterFifteen;

import java.io.*;
import java.util.List;

public class SerializationDemo {

    public void serialize(List<Serialization> members, String filename){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(members);
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Serialization> deserialize (String filename){
        List <Serialization> members = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            members = (List<Serialization>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return members;
    }
}
