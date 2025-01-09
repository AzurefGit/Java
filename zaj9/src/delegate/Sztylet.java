package delegate;

public class Sztylet implements Weapon{
    @Override
    public void attack() {
        System.out.println("Zaatakowano sztyletem");System.out.println();
    }
}
