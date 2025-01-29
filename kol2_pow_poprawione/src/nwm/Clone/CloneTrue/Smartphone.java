package nwm.Clone.CloneTrue;

import java.util.Date;

public class Smartphone implements Cloneable{
    String brand;
    String model;
    Date productionDate;

    public Smartphone(String brand, String model, Date productionDate) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Main{
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Xi", "A1", new Date(2024,12,12));
        Smartphone smartphone2 = null;

        try {
            smartphone2 = (Smartphone) smartphone1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("N u s s");
        }

        smartphone2.setProductionDate(new Date(1999,11,11));
        System.out.println(smartphone1.getProductionDate());
        System.out.println(smartphone2.getProductionDate());
    }
}