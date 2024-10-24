package zad2;

import com.sun.tools.javac.Main;

public class Product {
    public static int numberOfProducts;
    static final int MAX_PRODUCTS = 100;

    public Product() {
        numberOfProducts++;
        if(numberOfProducts > MAX_PRODUCTS){
            System.out.println("Ilość pkt przekroczona");
            numberOfProducts = MAX_PRODUCTS;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++){
            Product p = new Product();
        }
    }
}
