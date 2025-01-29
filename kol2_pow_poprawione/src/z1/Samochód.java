package z1;

public class Samochód {
    private Silnik silnik;

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start(){
        silnik.uruchom();
    }

    public void stop(){
        silnik.zatrzymaj();
    }
}

class Main{
    public static void main(String[] args) {
        Samochód samochodB = new Samochód(new BenzynowySilnik());
        Samochód samochodD = new Samochód(new SilnikDiesel());

        samochodB.start();
        samochodB.stop();
        samochodD.start();
        samochodD.stop();
    }
}
