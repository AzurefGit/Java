package z4;

public class Main {
    public static void main(String[] args) {
         Pair<Integer, String> pair = new Pair<>(12, "Cześć");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
