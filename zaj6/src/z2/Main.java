package z2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
        electronicDevices.add(new Laptop("Dell", "X4", 2024));
        electronicDevices.add(new Television("LG", "C5", 2024));
        electronicDevices.add(new Smartphone("Samsung", "A23", 2024));
        electronicDevices.add(new Smartphone("Xiaomi", "X3 Gt", 2024));
        electronicDevices.add(new Smartphone("Nokia", "2115", 2024));

        for(ElectronicDevice ed: electronicDevices){
            ed.turnOn();
            ed.turnOff();
        }
    }
}
