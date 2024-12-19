package z1;

public class TestMyComparator implements MyComparator {
    @Override
    public int compare(int a, int b) {
        if (a < b) {
            return -1;
        } else if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        TestMyComparator comparator = new TestMyComparator();

        System.out.println(comparator.compare(5, -10));
        System.out.println(comparator.compare(10, 10));
        System.out.println(comparator.compare(1, 10));
    }
}
