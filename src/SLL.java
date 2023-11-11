import java.util.Iterator;

public class SLL<E> implements ListADT<E> {
    private SLLNode<E> head;
    private SLLNode<E> tail;
    private int size;

    public SLL() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public SLLNode<E> getHead() {
        return head;
    }

    public SLLNode<E> getTail() {
        return tail;
    }

    public void add(E item) {
        SLLNode<E> newNode = new SLLNode<>(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void addAll(ListADT<E> items) {
        SLLIterator<E> iterator = new SLLIterator<>((SLL<E>) items);
        while (iterator.hasNext()) {
            add(iterator.next());
        }
    }

    @Override
    public E get(int index) {
        SLLNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public void remove(int index) {
        SLLNode<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }

    @Override
    public void set(int index, E item) {
        SLLNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setValue(item);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        SLLNode<E> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    @Override
    public void clear() {
        this.head = this.tail = null;
    }

    @Override
    public Iterator<E> iterator() {
        SLLIterator<E> iterator = new SLLIterator<E>(this);
        return iterator;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "null";
        }
        String list = "";
        SLLNode<E> current = head;
        while (current != null) {
            list += current.getValue() + " ";
            current = current.getNext();
        }
        return list;
    }
}