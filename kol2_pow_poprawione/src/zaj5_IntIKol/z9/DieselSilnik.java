package zaj5_IntIKol.z9;

public class DieselSilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("U S D");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Z S D");
    }
}
