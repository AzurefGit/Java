package delegate;

public class Miecz implements Weapon{
    @Override
    public void attack() {
        System.out.println("Zaatakowano z miecza");
    }
}
