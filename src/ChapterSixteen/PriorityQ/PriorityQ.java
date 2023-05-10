package ChapterSixteen.PriorityQ;

import java.util.PriorityQueue;

public class PriorityQ<T> {
    private PriorityQueue<QueueItem<T>> queue = new PriorityQueue<>();

    public void push(T item, int priority) {
        queue.add(new QueueItem<>(item, priority));
    }

    public T pop() {
        return queue.poll().getItem();
    }

    public T peek() {
        return queue.peek().getItem();
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return "PriorityQ{" +
                "queue=" + queue +
                '}';
    }

    private class QueueItem<T> implements Comparable<QueueItem<T>> {
        private T item;
        private int priority;

        public QueueItem(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }

        public T getItem() {
            return item;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public int compareTo(QueueItem<T> other) {
            return Integer.compare(priority, other.getPriority());
        }
    }
}
