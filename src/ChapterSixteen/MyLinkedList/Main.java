package ChapterSixteen.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        var items = new LinkedList();
        items.addLast(10);
        items.addLast(20);
        items.addLast(30);
        items.removeLast();
        System.out.println(items.indexOf(10));
        System.out.println(items.contains(40));
//        items.printList();
    }
}
