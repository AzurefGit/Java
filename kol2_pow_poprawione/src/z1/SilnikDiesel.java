package z1;

public class SilnikDiesel implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("U s D");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Z s D");
    }
}
