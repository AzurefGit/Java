package p3;

import java.util.Arrays;

public class Item implements Comparable<Item>{
    String name;
    double weight;
    double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args) {
        Item[] items = new Item[4];
        items[0] = new Item("Item1", 2.5, 100.0);
        items[1] = new Item("Item2", 1.2, 150.0);
        items[2] = new Item("Item3", 3.0, 200.0);
        items[3] = new Item("Item4", 0.8, 50.0);

        System.out.println("Przed sortowaniem:");
        for (Item item : items) {
            System.out.println(item);
        }

        Arrays.sort(items);

        System.out.println("\nPo sortowaniu:");
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
