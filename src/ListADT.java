import java.util.Iterator;

public interface ListADT<E> {

    public void add(E item);

    public void addAll(ListADT<E> items);

    public E get(int index);

    public void remove(int index);

    public void set(int index, E item);

    public int size();

    public boolean isEmpty();

    public Object[] toArray();

    public void clear();

    public Iterator<E> iterator();

}
