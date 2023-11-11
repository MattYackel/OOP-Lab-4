import java.util.Iterator;

public class SLLIterator<E> implements Iterator<E> {

    SLL<E> list;
    SLLNode<E> current;

    public SLLIterator(SLL<E> list) {
        this.list = list;
        this.current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E value = current.getValue();
        current = current.getNext();
        return value;
    }
}
