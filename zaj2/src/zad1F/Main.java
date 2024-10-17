package zad1F;

public class Main {
    public static void Main(String[] args){
        zad1F.Point p1 = new Point(1,2);
        zad1F.Point p2 = new Point(3,4);
        double dys = p1.distance(p2);
        System.out.println(dys);
    }
}
