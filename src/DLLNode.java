public class DLLNode<E> {
    private E value;
    private DLLNode<E> next;
    private DLLNode<E> prev;

    public DLLNode(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    public DLLNode<E> getNext() {
        return next;
    }
    public DLLNode<E> getPrev() {
        return prev;
    }
    public E getValue() {
        return value;
    }
    public void setNext(DLLNode<E> next) {
        this.next = next;
    }
    public void setPrev(DLLNode<E> prev) {
        this.prev = prev;
    }
    public void setValue(E value) {
        this.value = value;
    }
    public boolean hasNext() {
        return next != null;
    }
    public boolean hasPrev() {
        return prev != null;
    }
}
