package zaj5_IntIKol.z10;

public class Użytkownik {
    private Powiadomienie powiadomienie;

    public Użytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyślij(informacja);
    }
}

class Main{
    public static void main(String[] args) {
        Użytkownik użytkownikEmail = new Użytkownik(new Email());
        Użytkownik użytkownikPoczty = new Użytkownik(new Poczta());

        użytkownikEmail.powiadomOModernizacji("Modernizacja");
        użytkownikPoczty.powiadomOModernizacji("Mod poczty");
    }
}