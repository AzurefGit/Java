import java.util.ArrayList;

public class ListyTablicoweTest {

    public static int minimumValue(ArrayList<Integer> lista) {
        int minimum = lista.getFirst();
        for (int i = 0; i < lista.size(); i++) {
            if (minimum > lista.get(i)) {
                minimum = lista.get(i);
            }
        }
        return minimum;
    }

    public static double average(ArrayList<Double> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        return suma / lista.size();
    }

    public static int countZeros(ArrayList<Integer> lista) {
        int counter = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public static String odwrocNapis(String napis) {
        //StringBuffer to samo tylko można go wykorzystać wielowątkowo.(znaczenie przy duzych operacjach)
        StringBuilder odwrocony = new StringBuilder(napis);
        return odwrocony.reverse().toString();
    }

    public static boolean napisZaczynaIKonczy(String napis) {
        return napis.charAt(0) == napis.charAt(napis.length() - 1);
    }

//    public static boolean zmienOstatniaIPierwszaLitere(String napis){
//        StringBuilder nowyNapis = new StringBuilder(napis);
//        napis.charAt(0) == napis.charAt(napis.length()-1)
//        char temp = napis.charAt(0);
//        nowyNapis.setCharAt(0) = nowyNapis.charAt(nowyNapis.length()-1);
//        nowyNapis.setcharAt(nowyNapis.length()-1) = temp;

//    }

    public static void choinka(String znak, int n) {
        StringBuilder ch = new StringBuilder();
        for (int i = 0; i < n; i++) {
            System.out.println(ch);
            System.out.println();
            for (int j = 0; j < n; j++) {
                ch.append(znak + " ");
            }

        }
    }
}


