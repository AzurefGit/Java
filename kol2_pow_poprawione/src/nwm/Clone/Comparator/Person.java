package nwm.Clone.Comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class LastNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}

class BirthDateComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o2.birthDate.compareTo(o1.birthDate);
    }
}

class Main3{
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person("1.", "Fio", LocalDate.of(1999,01,01));
        Person p2 = new Person("2.", "Dio", LocalDate.of(9000,01,01));
        Person p3 = new Person("3.", "Tre", LocalDate.of(2002,01,01));
        Person p4 = new Person("4.", "Nan", LocalDate.of(3000,01,01));

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        System.out.println(people);
        Collections.sort(people, new LastNameComparator());
        System.out.println(people);
        Collections.sort(people, new BirthDateComparator());
        System.out.println(people);
    }
}