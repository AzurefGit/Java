package p6;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Person {
    String firstName;
    LocalDate birthDate;

    public Person(String firstName, LocalDate birthDate) {
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + '\'' +
                ", birthDate:" + birthDate +
                '\n' ;
    }

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Ff", LocalDate.of(2024, 4, 6));
        people[1] = new Person("AA", LocalDate.of(2026, 8, 3));
        people[2] = new Person("Bb", LocalDate.of(2003, 1, 8));
        people[3] = new Person("Cd", LocalDate.of(2020, 5, 4));
        people[4] = new Person("Fr", LocalDate.of(2021, 1, 2));

        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new LastNameComparator());
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new BirthDateComparator());
        System.out.println(Arrays.toString(people));
    }
}

class LastNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class BirthDateComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getBirthDate().compareTo(o1.getBirthDate());
    }
}
