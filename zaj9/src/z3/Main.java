package z3;

public class Main {
    public static <T> void isEqual(T v1, T v2){
        System.out.println(v1.equals(v2));
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        isEqual(a,b);

        String c = "a";
        String d = "b";
        isEqual(c,d);

        isEqual(a,c);
    }
}
