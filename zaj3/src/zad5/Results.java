package zad5;

import zad4.Vehicle;

import java.util.Objects;

public class Results {
    private String brand;
    private String model;
    private int[] myIntArray = new int[3];

    public Vehicle(String brand, String model, int yearOfProduction) {
        if(brand == null || brand.isEmpty()) {
            this.brand = "---";
        }
        else {
            this.brand = brand;
        }
        if(model == null || model.isEmpty()) {
            this.model = "---";
        }
        else {
            this.model = model;
        }
        if(yearOfProduction <= 2024) {
            this.yearOfProduction = yearOfProduction;
        }
        else{
            this.yearOfProduction = 2024;
        }
    }

    @Override
    public String toString(){
        return "Vehicle: "
                + brand + " " + model + " Year: " + yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Subaru", "FromFuture", 2222);
        Vehicle v2 = new Vehicle("Fiat", "125p", 1950);
        Vehicle v3 = new Vehicle("Audi", "A4", 2000);

        System.out.println(v2);
    }
}
