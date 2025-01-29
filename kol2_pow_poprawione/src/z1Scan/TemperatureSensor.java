package z1Scan;

public class TemperatureSensor implements Sensor{

    @Override
    public double readValue() {
        return 1;
    }

    @Override
    public String getStatus() {
        return "TemperatureSensor";
    }

    @Override
    public void reset() {
        System.out.println("TemperatureSensor reset");
    }
}

class PressureSensor implements Sensor{

    @Override
    public double readValue() {
        return 0;
    }

    @Override
    public String getStatus() {
        return "PressureSensor";
    }

    @Override
    public void reset() {
        System.out.println("PressureSensor reset");
    }
}

class SensorTest{
    public static void main(String[] args) {
        PressureSensor pS = new PressureSensor();
        TemperatureSensor tS = new TemperatureSensor();

        System.out.println(tS.readValue());
        System.out.println(tS.getStatus());
        tS.reset();

        System.out.println(pS.readValue());
        System.out.println(pS.getStatus());
        pS.reset();
    }
}