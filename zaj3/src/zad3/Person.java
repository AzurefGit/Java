package zad3;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        if(firstName == null || firstName.isEmpty()) {
            this.firstName = "---";
        }
        else {
            this.firstName = firstName;
        }
        if(lastName == null || lastName.isEmpty()) {
            this.firstName = "---";
        }
        else {
            this.firstName = lastName;
        }
        this.age = Math.max(age, 0);
    }

    @Override
    public String toString(){
        return "Person: " + firstName + " " + lastName + " Age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Adam", "Wojt", 31);
        Person p2 = new Person("Pan", "Jaweł", 31);
        Person p3 = new Person("Paweł", "Jumper", 30);
    }
}
