package p4;

import java.time.LocalDate;
import java.util.Arrays;

public class Pracownik {
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "imie=" + imie + ", pensja= " + pensja + " Data z: " + dataZatrudnienia + '\n';
    }

    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[5];
        pracownicy[0] = new Pracownik("Anna", 3000.00, LocalDate.of(2015, 5, 10));
        pracownicy[1] = new Pracownik("Jan", 5000.00, LocalDate.of(2018, 3, 15));
        pracownicy[2] = new Pracownik("Kasia", 4000.00, LocalDate.of(2020, 8, 1));
        pracownicy[3] = new Pracownik("Piotr", 3500.00, LocalDate.of(2017, 11, 22));
        pracownicy[4] = new Pracownik("Tomasz", 6000.00, LocalDate.of(2016, 7, 5));


        System.out.println(Arrays.toString(pracownicy));

        Arrays.sort(pracownicy, new PracownikComparator());
            System.out.println();

        System.out.println(Arrays.toString(pracownicy));

    }
}
