package zad5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Double> listaOcen) {
    public void averageGrades(){
        double suma = 0;
        for(int i = 0; i < listaOcen.size(); i++){
            suma += listaOcen.get(i);
        }
        System.out.println(suma/listaOcen.size());
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Double> oceny = new ArrayList<Double>();
        oceny.add(5.0);
        oceny.add(3.0);
        oceny.add(5.0);
        Student s1 = new Student("Jan", "Janowski", oceny);

        s1.averageGrades();
    }
}
