package generic;

public class Box <T,U>{ //<T> - type może być inne.
    private T value;
    private U value2;

    public Box(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public U get2() {
        return value2;
    }

    public void set2(U value2) {
        this.value2 = value2;
    }
}
