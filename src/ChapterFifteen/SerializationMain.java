package ChapterFifteen;

import java.util.ArrayList;
import java.util.List;

public class SerializationMain {
    public static void main(String[] args) {
//        List <Serialization> members = new ArrayList<>();
//        members.add(new Serialization("Michael", "Josh", 22));
//        members.add(new Serialization("Mich", "Josh", 21));
//        members.add(new Serialization("Mi", "Josh", 19));
//        members.add(new Serialization("Chael", "Josh", 18));
//        members.add(new Serialization("el", "Josh", 17));
//
//        System.out.println("Participants: " + members);

        SerializationDemo demo = new SerializationDemo();
//        demo.serialize(members, "C:\\Users\\DELL\\Desktop\\Michael\\IdeaProjects\\theSeedProjects\\src\\ChapterFifteen\\serial.ser");
//        System.out.println("Done");

        List<Serialization> newlist = demo.deserialize("C:\\Users\\DELL\\Desktop\\Michael\\IdeaProjects\\theSeedProjects\\src\\ChapterFifteen\\serial.ser");
        System.out.println("New list " + newlist);
    }
}
