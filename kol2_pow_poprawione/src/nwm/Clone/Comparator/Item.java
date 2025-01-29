package nwm.Clone.Comparator;


import java.util.Arrays;
import java.util.Collections;

public class Item implements Comparable<Item> {
    String name;
    double weight;
    double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + weight;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }
}

class Main{
    public static void main(String[] args) {
        Item[] items = { new Item("a", 1.1666666666, 23.2),
                         new Item("ab", 1.12, 23.2),
                         new Item("abc", 1.1222, 23.2),
                         new Item("abcd", 1.122222, 23.2)};

        System.out.println(Arrays.toString(items));
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
    }
}