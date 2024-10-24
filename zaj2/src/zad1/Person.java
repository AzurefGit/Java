package zad1;

import java.util.Objects;

public class Person {
    public String imie;
    public static String nazwaUczelni = "UWM";
    public String nazwisko;
    public double ocena;

    public Person(String imie, String nazwisko, double ocena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ocena = ocena;
    }
//    @Override
//    public String toString(){
//        return "Nazywam się " + imie + " " + nazwisko + ", studiuję na "
//                + nazwaUczelni;
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "imie='" + imie + '\'' +
//                ", nazwisko='" + nazwisko + '\'' +
//                '}';
//    }


//    public String przedstawSie(){
//        return "Nazywam się " + imie + " " + nazwisko + ", studiuję na "
//                + nazwaUczelni;
//    }
//    public boolean equals(Object o){
//        if(o instanceof Person other) {
//            if (this.imie.equals((other.imie)) &&
//                    this.nazwisko.equals((other.nazwisko))){
//                return true;
//            }
//        }
//        return false;
//    }
//    public int hashCode(){
//        return Objects.hash(imie, nazwisko);
//    }

// rpm/generate/equ.. and hash.../...
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(imie, person.imie) && Objects.equals(nazwisko, person.nazwisko);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(imie, nazwisko);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.ocena, ocena) == 0 &&
                Objects.equals(imie, person.imie) &&
                Objects.equals(nazwisko, person.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, ocena);
    }

    public static void main(String[] args){
        Person p1 = new Person("Adam", "Kowalski", 3.0);
        Person p2 = new Person("Kasia", "Kowalska", 4.0);
        Person p3 = new Person("Kasia", "Kowalska", 4.0);
        System.out.println(p1);
        System.out.println(p2.hashCode() + " " + p3.hashCode());
        System.out.println(p1.equals(p3));


        // p1.imie = "Andrzej";
        // p1.nazwisko = "Kowalski";
//        System.out.println(p1.przedstawSie());
//        System.out.println(p1.imie + " " + p1.nazwisko + " " + nazwaUczelni);
//        //Person.nazwaUczelni poza
//        Person.nazwaUczelni = "ART";
//        System.out.println(p1.przedstawSie());
//        System.out.println(p2.przedstawSie());
    }
}
