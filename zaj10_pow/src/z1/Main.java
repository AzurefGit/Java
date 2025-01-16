package z1;

public class Main {
    public static void main(String[] args) {
        Silnik benzynowySilnik = new BenzynowySilnik();
        Samochod samochódBenzynowy = new Samochod(benzynowySilnik);
        samochódBenzynowy.start();
        samochódBenzynowy.stop();

        Silnik dieselSilnik = new DieselowySilnik();
        Samochod samochódDieselowy = new Samochod(dieselSilnik);
        samochódDieselowy.start();
        samochódDieselowy.stop();
    }
}