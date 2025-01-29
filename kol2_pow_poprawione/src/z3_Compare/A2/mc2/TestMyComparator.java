package z3_Compare.A2.mc2;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if(a > b){
            return 1;
        } else if (a < b) {
            return -1;
        }
        return 0;
    }
}

class Main{
    public static void main(String[] args) {
        TestMyComparator tmc = new TestMyComparator();
        System.out.println(tmc.compare(1, 3));
        System.out.println(tmc.compare(1, -3));
        System.out.println(tmc.compare(3, 3));
    }
}