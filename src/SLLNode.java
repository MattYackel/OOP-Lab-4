public class SLLNode<E> {
    private E value;
    private SLLNode<E> next;

    public SLLNode(E value) {
        this.value = value;
        this.next = null;
    }

    public SLLNode<E> getNext() {
        return next;
    }

    public E getValue() {
        return value;
    }

    public void setNext(SLLNode<E> next) {
        this.next = next;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }
}