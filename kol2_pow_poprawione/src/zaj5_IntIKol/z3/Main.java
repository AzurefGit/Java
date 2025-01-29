package zaj5_IntIKol.z3;

public class Main{
    public static void main(String[] args) {
        Integer a1 = 2;
        Integer a2 = 2;

        isEqual(a1, a2);

        String s1 = "s1";
        String s2 = "s2";

        isEqual(s1, s2);

        isEqual(a1, s1);

    }

    public static <T> void isEqual(T v1, T v2){
        System.out.println(v1.equals(v2));
    }
}
