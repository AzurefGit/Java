package nwm.Clone.Comparator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Pracownik{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "" + pensja;
    }
}

class MyComparator implements Comparator<Pracownik>{
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.pensja, o2.pensja);
    }
}

class Main2{
    public static void main(String[] args) {
        Pracownik[] pracownicy = {
                new Pracownik("Js",1222.22,LocalDate.of(2020,11,10)),
                new Pracownik("Js",12225.22,LocalDate.of(2020,11,10)),
                new Pracownik("Js",12222.22,LocalDate.of(2020,11,10)),
                new Pracownik("Js",122.22,LocalDate.of(2020,11,10))
        };
        System.out.println(Arrays.toString(pracownicy));
        Arrays.sort(pracownicy, new MyComparator());
        System.out.println(Arrays.toString(pracownicy));
    }
}