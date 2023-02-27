package DataStructures;

public class Stack {

    private int count = 0;
    private int[] elements;
    public Stack(int stackSize) {
        elements = new int[stackSize];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public void push(int element) {
        if (isFull()) throw new StackOverflowError("Stack is Full");
        elements[count++] = element;
    }
    public int pop() {
        return elements[--count];
    }
    public boolean isFull() {
        if (elements.length == count)
            return true;
        else
            return false;
    }
    public int peek() {
        return elements[count-1];
    }
}
