package zad2;

public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("D", 1, 22222, "E");
        Person p1 = new Person("A", "B", a1);
        System.out.println(p1.firstName() + " " + p1.lastName() + " " + p1.Address());
        System.out.println(a1.street() + " " + a1.houseNumber() + " " + a1.postalCode() + " " + a1.city());
    }
}
