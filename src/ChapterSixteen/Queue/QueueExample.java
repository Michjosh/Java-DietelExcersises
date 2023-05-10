package ChapterSixteen.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(2);
        queue.add("apple");
        queue.add("banana");
        queue.add("orange");

    }
}
