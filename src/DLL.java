import java.util.NoSuchElementException;
import java.util.List;

public class DLL<E> implements DLLADT<E> {
    private DLLNode<E> head;
    private DLLNode<E> tail;
    private int size;

    public DLL() {
        this.head = this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E item) {
        DLLNode<E> newNode = new DLLNode<E>(item);
        if (isEmpty()) {
            head = tail = newNode;
            size++;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
            size++;
        }
    }

    @Override
    public void addLast(E item) {
        DLLNode<E> newNode = new DLLNode<E>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty, cannot remove first element.");
        } else {
            E value = head.getValue();
            head = head.getNext();
            head.setPrev(null);
            size--;
            return value;
        }
    }

    @Override
    public void addAll(ListADT<? extends E> items) {
        for (int i = 0; i < items.size(); i++) {
            addLast(items.get(i));
        }
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty, cannot remove last element.");
        } else {
            E value = tail.getValue();
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
            return value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString(){
        String result = "";
        DLLNode<E> current = head;
        while(current != null){
            result += current.getValue() + " ";
            current = current.getNext();
        }
        return result;
    }
}
