package zad8;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("Dell", "PC");
        c1.partsPrices.add(1.2);
        c1.partsPrices.add(2.3);
        c1.partsPrices.add(3.4);
        System.out.println(c1.getManufacturer() + " " + c1.getModel() + " " + c1.getPartsPrices());

        Desktop d2 = new Desktop("Asus", "PC", "MidiTower");
        d2.partsPrices.add(11.2);
        d2.partsPrices.add(22.3);
        d2.partsPrices.add(33.4);
        System.out.println(d2.getManufacturer() + " " + d2.getModel() + " " + d2.getCaseType() + " " + d2.getPartsPrices());

        Laptop l3 = new Laptop("Acer", "Laptop", 199);
        l3.partsPrices.add(111.2);
        l3.partsPrices.add(222.3);
        l3.partsPrices.add(333.4);
        System.out.println(l3.getManufacturer() + " " + l3.getModel() + " " + l3.getWeight() + "g " + l3.getPartsPrices());

    }
}
