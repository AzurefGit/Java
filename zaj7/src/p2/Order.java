package p2;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements Comparable<Order>{
    String productName;
    int quantity;
    public double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return " " + unitPrice;
    }


    @Override
    public int compareTo(Order o) {
        if (this.unitPrice == o.unitPrice) {
            return Integer.compare(this.quantity, o.quantity);
        }
        return Double.compare(o.unitPrice, this.unitPrice);
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Pr 1", 100, 3.5));
        orders.add(new Order("Pr 2", 150, 4.5));
        orders.add(new Order("Pr 3", 125, 3.5));
        orders.add(new Order("Pr 4", 200, 5.5));
        System.out.println(orders);
        Collections.sort(orders);
        System.out.println(orders);
    }
}


