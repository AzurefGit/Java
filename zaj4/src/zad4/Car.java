package zad4;

public class Car extends Vehicle{
    public String brand;

    public Car(String brand){
        this.brand = brand;
    }
    //    @Override
//    public void drive() {
//        System.out.println("The car is moving");
//    }
    @Override
    public String drive() {
        return super.drive() + " " +  this.brand;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car("Opel");

        System.out.println(v1.drive());
        System.out.println(c1.drive());

    }
}
