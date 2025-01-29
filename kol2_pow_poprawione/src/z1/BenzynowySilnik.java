package z1;

public class BenzynowySilnik implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("U s B");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Z s B");
    }
}
