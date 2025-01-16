package z4;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> g1 = new GenericQueue<>();

        g1.enqueue(1);
        g1.enqueue(3);
        g1.enqueue(5);

        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
    }
}
