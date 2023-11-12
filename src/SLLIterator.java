import java.util.Iterator;

public class SLLIterator<E> implements Iterator<SLLNode<E>> {

    SLL<E> list;
    SLLNode<E> current;

    public SLLIterator(SLL<E> list) {
        this.list = list;
        this.current = list.getHead();
    }
    public SLLIterator(){
        this.list = null;
        this.current = null;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public SLLNode<E> next() {
        SLLNode<E> result = current;
        current = current.getNext();
        return result;
    }
}
