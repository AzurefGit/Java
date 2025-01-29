package z1;

public class Main {
    public static void main(String[] args) {
        Samochod samochódBenzynowy = new Samochod(new BenzynowySilnik());
        samochódBenzynowy.start();
        samochódBenzynowy.stop();

        Samochod samochódDieselowy = new Samochod(new DieselowySilnik());
        samochódDieselowy.start();
        samochódDieselowy.stop();
    }
}