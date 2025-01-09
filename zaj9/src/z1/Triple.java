package z1;

public class Triple<T,U,V>{
    private T value;
    private U value2;
    private V value3;

    public Triple(T value, U value2, V value3) {
        this.value = value;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getFirst() {
        return value;
    }
    public U getSecond() {
        return value2;
    }
    public V getThird() {
        return value3;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public void setValue3(V value3) {
        this.value3 = value3;
    }
}
