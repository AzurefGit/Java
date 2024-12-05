package z2;

public class Smartphone extends ElectronicDevice{
    public Smartphone(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon " + manufacturer + " włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("Telefon " + manufacturer + " wyłączony");
    }
}
