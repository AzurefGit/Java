package zad1E;

import java.time.Year;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String model, int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car(String brand, String model){
        this(brand, model, Year.now().getValue());
    }
}
