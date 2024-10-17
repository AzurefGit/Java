//import zad1.Person;
import zad1A.Book;
import zad1B.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
//        for(int i = 3; i<12; i++){
//            listaLiczbCalkowitych.add(i);
//        }

        //ListyTablicoweTest t1 = new ListyTablicoweTest() //bez static
        //z static
//        System.out.println(ListyTablicoweTest.minimumValue(listaLiczbCalkowitych));
        /*for(int i = listaLiczbCalkowitych.size() -1; i >= 0; i--){
            System.out.print(listaLiczbCalkowitych.get(i) + " ");
        }
        //enchanted for
        for(Integer liczbCalkowitych : listaLiczbCalkowitych.reversed()){
            System.out.println(liczbCalkowitych + " ");
       }*/

    //-------------------------------------------------
//        ArrayList<Double> listaLiczbZmiennoprzecinkowych = new ArrayList<>();
//        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
//        for(double i = 3; i<7; i++) {
//            listaLiczbZmiennoprzecinkowych.add(i);
//        }
//        listaLiczbCalkowitych.add(0);
//        listaLiczbCalkowitych.add(0);
//        listaLiczbCalkowitych.add(1);

//        System.out.println(ListyTablicoweTest.average(listaLiczbZmiennoprzecinkowych));
//        System.out.println(ListyTablicoweTest.countZeros(listaLiczbCalkowitych));
//        System.out.println(ListyTablicoweTest.odwrocNapis("AAA"));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadź tekst do odwrócenia: ");
//        String napis = scanner.nextLine();
//        int licz = scanner.nextInt();
//        System.out.println(ListyTablicoweTest.odwrocNapis(napis));
//        System.out.println(ListyTablicoweTest.napisZaczynaIKonczy("AsdasA"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadź znak: ");
//        String znak = scanner.nextLine();
//        System.out.print("Wprowadź liczbę: ");
//        int liczba = scanner.nextInt();
//        ListyTablicoweTest.choinka(znak, liczba);
        //-----------------------------------------------------------
        //Zajęcia 2._________________________________________________
        //zad1.Person p1 = new Person();
        //p1.imie = "Andrzej";
        //p1.nazwisko = "Kowalski";
        //p1.wiek = 24;
        //p1.rok = 2;
        //-----------------------------------------------------------

//        zad1A.Book b1 = new Book();
//
//        zad1A.Book b2 = new Book("Test2", "Test2 T. the Test2", 1000);
//
//        b1.title = "Test";
//        b1.author = "Test T. the Test";
//        b1.publicationYear = 2000;
//
//        System.out.println(b1.author);
//        System.out.println(b2.author);

        //-----------------------------------------------------------

        zad1B.Person p2 = new Person("Andrzej", "Duda");
        System.out.println(p2.firstName);
    }
}