package z3_Compare.A4;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements Comparable<Order>{
    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "[" + quantity + "; " + unitPrice +"]";
    }

    @Override
    public int compareTo(Order o) {
        if(o.unitPrice == this.unitPrice){
            return Double.compare(this.quantity, o.quantity);
        }
        return Double.compare(o.unitPrice, this.unitPrice);
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Order> list = new ArrayList<>();
        list.add(new Order("A", 13, 2.99));
        list.add(new Order("B", 1, 10.99));
        list.add(new Order("C", 12, 2.99));
        list.add(new Order("D", 50, 5.99));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
