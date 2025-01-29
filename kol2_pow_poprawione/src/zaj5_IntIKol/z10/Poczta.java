package zaj5_IntIKol.z10;

public class Poczta implements Powiadomienie{

    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Treść listu: " + wiadomość);
    }
}
