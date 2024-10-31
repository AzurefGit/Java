package zad6;

public class Child extends Base{
//    @Override
    public static void info(){
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        Base.info();
        Child.info();
    }
}
