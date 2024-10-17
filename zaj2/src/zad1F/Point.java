package zad1F;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        double d1, d2, d;
        d1 = Math.pow(this.x - otherPoint.x, 2);
        d2 = Math.pow(this.y - otherPoint.y, 2);
        d = Math.sqrt(d1 + d2);
        return d;
    }
}
