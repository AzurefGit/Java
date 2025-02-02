package zad8;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop extends Computer{
    public int weight;

    public Laptop(String manufacturer, String model, int weight) {
        super(manufacturer, model);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return getWeight() == laptop.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }
}
