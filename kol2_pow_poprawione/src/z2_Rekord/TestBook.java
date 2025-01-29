package z2_Rekord;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("AaAb", "JKK", 300);
        Book book2 = new Book("BBBb", "KbKAk", 400);
//        Book bookm0 = new Book("BBBb", "KbKAk", -1);

        System.out.println(book1.isLarge());
        System.out.println(book2.isLarge());



    }
}
