package zaj5_IntIKol.z10;

public class Email implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Wiadomosc email: " + wiadomość);
    }
}
