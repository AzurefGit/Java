package zaj5_IntIKol.z4;

public class Pair<T, U>{
    T o1;
    U o2;

    public Pair(T o1, U o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public T getFirst() {
        return o1;
    }

    public U getSecond() {
        return o2;
    }
}

class Main {
    public static void main(String[] args) {
        Pair<String, Integer> stringPair = new Pair<>("aaa",2);

        System.out.println(stringPair.getFirst());
        System.out.println(stringPair.getSecond());
    }
}
