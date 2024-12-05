package z2;

public class Television extends ElectronicDevice{

    public Television(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Tv " + manufacturer + " włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv " + manufacturer + " wyłączony");
    }
}
