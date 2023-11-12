public interface DLLADT<E> {
    void addFirst(E item);

    void addLast(E item);

    E removeFirst();

    void addAll(ListADT<? extends E> items);

    E removeLast();

    int size();

    boolean isEmpty();
}
