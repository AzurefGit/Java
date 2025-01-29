package zaj5_IntIKol.z8_Int;

public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }
}

class Main{
    public static void main(String[] args) {
        Biuro b1 = new Biuro(new StandardowyPrinter());

        b1.drukujDokument("sda");
    }
}
