package zad5;

public record Student(String imie, String nazwisko, int[] listaOcen) {
    public void averageGrades(int[] oceny){
        double suma = 0;
        for(int i = 0; i < oceny.length; i++){
            suma += oceny[i];
        }
        System.out.println(suma/oceny.length);
    }
}

class Main{
    public static void main(String[] args) {
        int[] oceny = new int[3];
        for(int i = 0; i < oceny.length; i++){
            oceny[i] = i+1;
        }
        Student s1 = new Student("Jan", "Janowski", oceny);

        s1.averageGrades();
    }
}
