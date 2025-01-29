package KolGr2.z1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("AAa", "d", 200);
        Book book2 = new Book("AAa", "d", 500);

        System.out.println(book2.isLarge());

        try{
            Book book3 = new Book("AAa", "d", -200);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
