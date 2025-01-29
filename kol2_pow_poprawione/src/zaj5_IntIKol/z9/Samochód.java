package zaj5_IntIKol.z9;

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
        Samochód samochódB = new Samochód(new BenzynowySilnik());
        Samochód samochódD = new Samochód(new DieselSilnik());

        samochódB.start();
        samochódB.stop();

        samochódD.start();
        samochódD.stop();
    }
}
