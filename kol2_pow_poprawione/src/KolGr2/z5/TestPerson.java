package KolGr2.z5;

public class TestPerson {
    public static void main(String[] args) {
        Student s = new Student();
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(compareObjects(s, p1));
        System.out.println(compareObjects(p1, p2));
        System.out.println(compareObjects(s, p2));

    }

    public static <T extends Person> boolean compareObjects(T o1, T o2){
        return o1.getClass().getName().equals(o2.getClass().getName());
    }
}
