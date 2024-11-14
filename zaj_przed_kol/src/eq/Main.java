package eq;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "X11", 2025);
        Vehicle v2 = new Vehicle("BMW", "X11", 2025);

        System.out.println(v1.toString());
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v1.equals(v2));

    }
}
