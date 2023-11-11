public class App {
    public static void main(String[] args) throws Exception {
        SLL<Integer> list = new SLL<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list);

        // list.remove(1);
        // System.out.println(list);

        // list.set(1, 2);
        // System.out.println(list);

        // Object[] arry = list.toArray();
        // for (Object i : arry) {
        //     System.out.println(i);
        // }

        SLL<Integer> list2 = new SLL<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list.addAll(list2);
        System.out.println(list);

        // SLLIterator<Integer> iterator = new SLLIterator<>(list);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
    }
}
