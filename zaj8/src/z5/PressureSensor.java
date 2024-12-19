package z5;

public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 0;
    }

    @Override
    public String getStatus() {
        return "Gambling\uD83D\uDC4D" + " \uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF"  + " \uD83C\uDFB0";
    }

    @Override
    public void reset() {
        System.out.println("Resetowanie");
    }
}
