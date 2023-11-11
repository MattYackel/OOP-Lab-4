public interface DLLADT<E> {
    void addFirst(E item);

    void addLast(E item);

    E removeFirst();

    void addAll(ListADT<E> items);

    E removeLast();

    int size();

    boolean isEmpty();
}
