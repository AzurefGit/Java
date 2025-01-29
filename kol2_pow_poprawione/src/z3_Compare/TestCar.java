package z3_Compare;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("A", 15000, 2204));
        cars.add(new Car("D", 11000, 2203));
        cars.add(new Car("C", 12000, 2202));
        cars.add(new Car("B", 10000, 2201));

        System.out.println(cars);
        cars.sort(new MyComparator());
        System.out.println(cars);

    }
}
