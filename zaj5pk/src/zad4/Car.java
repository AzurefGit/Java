package zad4;

public record Car(String brand, String model, double fuelConsumptionPer100km) {

    public double fuelCost(double fuelPrice, double distance){
        return fuelConsumptionPer100km * distance/100 * fuelPrice;
    }
}
