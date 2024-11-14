package eq;

import java.util.Calendar;
import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int productionYear;

    public Vehicle(String brand, String model, int productionYear) {
        if(brand == null || brand.isEmpty()){
            this.brand = "???";
        }
        else{
            this.brand = brand;
        }

        if(model == null || model.isEmpty()){
            this.model = "???";
        }
        else{
            this.model = model;
        }

        if(productionYear > Calendar.getInstance().get(Calendar.YEAR)){
            this.productionYear = Calendar.getInstance().get(Calendar.YEAR);
        }
        else{
            this.productionYear = productionYear;
        }

    }

    @Override
    public String toString() {
        return "Vehicle:" + "[" + brand + "] " + "[" + model + "] " + "Year: [" + productionYear + "].";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return productionYear == vehicle.productionYear && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear);
    }
}
