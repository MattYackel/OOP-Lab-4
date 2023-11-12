/**
 * Lab 4: Linear Lists
 * Date: Nov 10, 2023
 * Author: Matt Yackel
 */
public class App {
    public static void main(String[] args) throws Exception {
        SLL<Integer> list = new SLL<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.set(1, 2);
        list.add(3);
        System.out.println(" First SLL: " + list);

        SLL<Integer> list2 = new SLL<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println("Second SLL: " + list2);

        list.addAll(list2);
        System.out.println("  Combined: " + list + "\n");

        // SLLIterator<Integer> iterator = new SLLIterator<>(list);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next().getValue());
        // }

        DLL<Integer> dll = new DLL<>();
        dll.addFirst(11);
        dll.addFirst(22);
        dll.addFirst(33);
        dll.addLast(44);
        dll.addLast(55);
        dll.addLast(66);
        dll.removeFirst();
        dll.removeLast();
        System.out.println("     DLL: " + dll);

        dll.addAll(list);
        System.out.println("Combined: " + dll);
    }
}
