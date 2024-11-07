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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(getManufacturer(), computer.getManufacturer()) && Objects.equals(getModel(), computer.getModel()) && Objects.equals(getPartsPrices(), computer.getPartsPrices());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getModel(), getPartsPrices());
    }
}