package KolGr2.z1;

public record Book(String title, String author, int pages) {
    public Book {
        if (pages < 0){
            throw new IllegalArgumentException("Podaj dodatnią liczbę stron...");
        }
    }

    public boolean isLarge(){
        return pages > 400;
    }
}
