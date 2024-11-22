package walid;

import java.time.Year;
import java.util.Calendar;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String model, int productionYear) {
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
}
