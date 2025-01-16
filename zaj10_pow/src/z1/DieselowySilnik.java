package z1;

public class DieselowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Silnik diesel uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik diesel zatrzymany");
    }
}
