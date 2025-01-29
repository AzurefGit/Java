package zaj5_IntIKol.z1;

public class Triple<T, U, V> {
    T object1;
    U object2;
    V object3;

    public Triple(T object1, U object2, V object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void getFirst(){
        System.out.println(object1);
    }
    public void getSecond(){
        System.out.println(object2);
    }
    public void getThird(){
        System.out.println(object3);
    }
}

class Main{
    public static void main(String[] args) {
        Triple<Integer, Double, String> triple = new Triple<>(1, 2.2, "A");

        triple.getFirst();
        triple.getSecond();
        triple.getThird();
    }

}