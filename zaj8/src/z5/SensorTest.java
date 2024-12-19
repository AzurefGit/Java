package z5;

public class SensorTest {
    public static void main(String[] args) {
        PressureSensor pressureSensor = new PressureSensor();

        System.out.println(pressureSensor.getStatus());

        TemperatureSensor temperatureSensor = new TemperatureSensor();

        System.out.println(temperatureSensor.getStatus());
    }
}
