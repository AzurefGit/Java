package zaj5_IntIKol.z9;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("U B S");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Z B S");
    }
}
