package walid;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("","",5555);
        Car c2 = new Car("B","A",2002);
        System.out.println(c1.brand + " " + c1.model + " " + c1.productionYear);
        System.out.println(c2.brand + " " + c2.model + " " + c2.productionYear);
        System.out.println(Year.now().getValue());
    }
}
