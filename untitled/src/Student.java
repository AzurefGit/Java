public class Student {
    public int nrIndeksu;
    public String imie;
    public String nazwisko;

    public Student(){

    }
    public Student(int nrIndeksu, String imie, String nazwisko) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    private void przedstawSie(){
        System.out.println("Dzień dobry, nazywam się " + imie + " " + nazwisko);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Robert", "Kubica");
        Student student2 = new Student(2, "Andrzej", "emm");

        student.przedstawSie();
        student2.przedstawSie();
    }
}