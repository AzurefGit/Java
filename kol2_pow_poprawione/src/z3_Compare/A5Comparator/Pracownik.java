package z3_Compare.A5Comparator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Pracownik {
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

class Main{
    public static void main(String[] args) {
       Pracownik[] pracownicy = {
               new Pracownik("D", 51.0, LocalDate.of(2005, 1,2)),
               new Pracownik("D", 5.0, LocalDate.of(2005, 1,2))
       };
        System.out.println(Arrays.toString(pracownicy));
        Arrays.sort(pracownicy, new MyComparator());
        System.out.println();
        System.out.println(Arrays.toString(pracownicy));
    }
}