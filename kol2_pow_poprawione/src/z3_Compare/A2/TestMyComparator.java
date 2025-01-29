package z3_Compare.A2;

import java.util.ArrayList;
import java.util.Collections;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if(a < b){
            return -1;
        } else if (a == b) {
            return 0;
        }
        else {
            return 1;
        }
    }
}

class Main{
    public static void main(String[] args) {
        TestMyComparator testMyComparator = new TestMyComparator();
        System.out.println(testMyComparator.compare(1, 4));
        System.out.println(testMyComparator.compare(3, 2));
        System.out.println(testMyComparator.compare(1, 1));
    }
}
