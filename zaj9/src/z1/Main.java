package z1;

public class Main {
    public static void main(String[] args) {
        Triple<Integer, String, Double> triple = new Triple<>(10, "aaa", 8.1);

        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());

//        Triple triple1 = new Triple(1, 1.2, "111a");

    }
}
