package zaj5_IntIKol.z8_Int;

public class StandardowyPrinter implements Printer{

    @Override
    public void drukuj(String tekst) {
        System.out.println("Std printer: " + tekst);
    }
}
