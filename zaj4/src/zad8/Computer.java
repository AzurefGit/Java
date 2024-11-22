package zad8;
import java.util.ArrayList;
import java.util.Objects;

public class Computer {
    public String manufacturer;
    public String model;
    public ArrayList<Double> partsPrices = new ArrayList<Double>();

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Double> getPartsPrices() {
        return partsPrices;
    }

    public void setPartsPrices(ArrayList<Double> partsPrices) {
        this.partsPrices = partsPrices;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
