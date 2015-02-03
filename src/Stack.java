/**
 * Created by ellw on 02.02.15.
 */
public class Stack<T> {
    private int size;
    private Entry<T> firstEntry;

    public Stack() {
        this.size = 0;
        this.firstEntry = null;
    }

    public int getSize() {
        return this.size;
    }

    public void push(T element) {
        Entry<T> entry = new Entry<T>(element, null);
        if (this.size == 0) {
            this.firstEntry = entry;
        } else {
            entry.setNext(this.firstEntry);
            this.firstEntry = entry;
        }
        this.size++;
    }

    public T pop() {
        Entry<T> currentEntry = this.firstEntry;
        if (currentEntry == null) {
            throw new NullPointerException("Empty Stack");
        }
        this.firstEntry = firstEntry.getNext();
        this.size--;
        return currentEntry.getElement();
    }
}
