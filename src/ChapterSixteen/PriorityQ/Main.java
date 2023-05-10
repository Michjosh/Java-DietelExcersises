package ChapterSixteen.PriorityQ;

import java.sql.Array;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
// add elements to the priority queue
        pq.add("foo");
        pq.add("bar");
        pq.add("baz");

// convert the priority queue into an array of strings
        String[] arr = pq.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));




//        Iterator<String> myIterator = pq.iterator();
//
//        while (myIterator.hasNext()){
//            System.out.println(myIterator.next());
//        }
        for (String str : pq) {
            System.out.println(str);
        }
    }
}
