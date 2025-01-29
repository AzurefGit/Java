package p9;

import java.util.Calendar;
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
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("a", "b", new Date(2020,Calendar.DECEMBER,01));
        Smartphone s2 = null;

        try{
            s2 = (Smartphone) s1.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("ssss");
        }

        s2.productionDate = new Date(2024, Calendar.JANUARY,1);

        System.out.println(s1.getProductionDate());
        System.out.println(s2.getProductionDate());
    }
}
