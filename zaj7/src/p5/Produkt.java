package p5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Produkt {
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    public Produkt(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(LocalDate dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataWaznosci=" + dataWaznosci +
                '}' + '\n';
    }

    public static void main(String[] args)
    {
        Produkt[] produkts = new Produkt[5];
        produkts[0] = new Produkt("Mleko1", 3.50, LocalDate.of(2011, 12, 1));
        produkts[1] = new Produkt("Mleko2", 4.50, LocalDate.of(2055, 6, 28));
        produkts[2] = new Produkt("Mleko3", 5.50, LocalDate.of(2002, 5, 5));
        produkts[3] = new Produkt("Mleko4", 6.50, LocalDate.of(2019, 2, 2));
        produkts[4] = new Produkt("Mleko5", 1.50, LocalDate.of(2022, 11, 13));

        System.out.println(Arrays.toString(produkts));
        Arrays.sort(produkts, new ProduktComparator());
        System.out.println();
        System.out.println(Arrays.toString(produkts));
    }
}

class ProduktComparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.getDataWaznosci().compareTo(o2.getDataWaznosci());
//        return Integer.compare(o1.getDataWaznosci().compareTo(o2.getDataWaznosci()), 0);
    }

}