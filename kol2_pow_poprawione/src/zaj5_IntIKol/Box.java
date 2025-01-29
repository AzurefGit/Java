package zaj5_IntIKol;

import java.util.Scanner;

public class Box<T> {
    T object;

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Box<String> doubleBox = new Box<>();

        doubleBox.set(s1.nextLine());
        System.out.println(doubleBox.get());
    }
}