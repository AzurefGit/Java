package z2;

public class Main {
    public static void main(String[] args) {
        Counter<Double> doubleCounter = new Counter<>();
        doubleCounter.add(3.3);
        doubleCounter.add(1.1);
        doubleCounter.add(3.1415);

        doubleCounter.getCount();

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("aaa");
        stringCounter.add("bbb");

        stringCounter.getCount();
    }
}
