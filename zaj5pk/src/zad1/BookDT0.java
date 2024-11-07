package zad1;

public record BookDT0(String title, String author, double price, int yearOfPublication) {
}


class Main {
    public static void main(String[] args) {
        BookDT0 b1 = new BookDT0("Książka 0", "Nieznany", 33.33, 1956);
        BookDT0 b2 = new BookDT0("Książka", "Nieznany", 22.22, 2024);
        BookDT0 b3 = new BookDT0("Książka cz.2", "Nieznany", 22.22, 2025);
    }
}
