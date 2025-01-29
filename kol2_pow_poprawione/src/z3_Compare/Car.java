package z3_Compare;

import java.util.Comparator;

public class Car {
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        if(mileage < 0 || yearOfProduction < 0){
            throw new IllegalArgumentException("Wartości nie mogą być ujemne");
        }
        else {
            this.brand = brand;
            this.mileage = mileage;
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", yearOfProduction=" + yearOfProduction;
    }
}

class MyComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o2.mileage, o1.mileage);
    }
}