package KolGr2.z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Car {
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        if(mileage < 0 || yearOfProduction < 0){
            throw new IllegalArgumentException("Wartości nie ujemne!!!");
        }
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "" + mileage;
    }
}


class MyComparator implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o2.mileage, o1.mileage);
    }
}

class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 12222, 2021);
        Car c2 = new Car("KIA", 122, 2025);
        Car c3 = new Car("Seat", 1222, 2023);
        Car c4 = new Car("Skoda", 122222, 2000);

        ArrayList<Car> cars = new ArrayList<>();
//        Car[] cars2 = {c1, c2, c3, c4};
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);

        System.out.println(cars);
//        System.out.println(Arrays.toString(cars2));
//        Arrays.sort(cars2, new MyComparator());
        cars.sort(new MyComparator());
        System.out.println(cars);
//        System.out.println(Arrays.toString(cars2));
    }
}