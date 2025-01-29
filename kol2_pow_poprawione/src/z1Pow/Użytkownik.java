package z1Pow;

public class Użytkownik {
    private Powiadomienie powiadomienie;

    public Użytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyślij(informacja);
    }
}

class Main {
    public static void main(String[] args) {
        Użytkownik użytkownik = new Użytkownik(new Email());

        użytkownik.powiadomOModernizacji("AAA");
    }
}
