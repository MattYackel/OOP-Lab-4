public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
