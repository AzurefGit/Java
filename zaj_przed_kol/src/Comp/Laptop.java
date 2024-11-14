package Comp;

public class Laptop extends Computer{
    @Override
    public void start() {
        super.start();
        System.out.println("Laptop started.");
    }
}
