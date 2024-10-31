package zad5;

public class ExtendedCalculator extends Calculator{
    public int z;

//    public ExtendedCalculator(int x, int y, int z){
//        super(x, y);
//        this.z = z;
//    }
    public int add(int x, int y, int z) {
        return super.add(x, y) + z;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        ExtendedCalculator ec1 = new ExtendedCalculator();

        System.out.println(c1.add(1, 2));
        System.out.println(ec1.add(1, 2, 3));
    }
}
