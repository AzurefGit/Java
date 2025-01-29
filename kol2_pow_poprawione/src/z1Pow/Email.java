package z1Pow;

public class Email implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Wysłano wiadomość o treści: " + wiadomość);
    }
}
