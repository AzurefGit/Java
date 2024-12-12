package p4;

import java.util.Comparator;

public class PracownikComparator implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.getPensja(), o2.getPensja());
    }
}
