package DataStructures;

public class ArrayList1 {
 private int [] items;
 private  int[] newArray;

 private int count = 0;
public ArrayList1(int length){
    items = new int[length];
}
public void print(){
    for (int i = 0; i < count; i++) {
        System.out.println(items[i]);
    }
}

    public boolean isEmpty() {
        return count == 0;
    }


    public void add(int item) {
    if (isFull()) {
        newArray = new int[count * 2];
        if (count >= 0) System.arraycopy(items, 0, newArray, 0, count);
        items = newArray;
    }
        items[count++] = item;
    }

    public void add(int item, int index) {
        if (isFull()) {
            int[] newArray = new int[items.length * 2];
            System.arraycopy(items, 0, newArray, 0, index);
            newArray[index] = item;
            System.arraycopy(items, index, newArray, index + 1, items.length - index);
            items = newArray;
        } else {
            if (index < count) {
                System.arraycopy(items, index, items, index + 1, count - index);
            }
            items[index] = item;
            count++;
        }
    }

    public void remove(int item) {
    if (isEmpty()) throw new IllegalArgumentException();
    for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                items[i] = items[--count];
                items[i] = items[i + 1];
            }
        }
    }

    public int get(int index) {
        if (isEmpty()) throw new IllegalArgumentException();
        return items[index];
    }

    public int getIndexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public int size() {
        return count;
    }

    public int getCapacity() {
        return items.length;
    }

    public boolean isFull() {
        if (items.length == count)
            return true;
        else
            return false;
    }
}
