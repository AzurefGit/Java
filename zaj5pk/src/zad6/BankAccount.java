package zad6;

public record BankAccount(String nrKonta, double saldo) {
    public BankAccount(String nrKonta){
        this(nrKonta, 0);
    }

}
class Main {
    public static void main(String[] args) {
        BankAccount bA1 = new BankAccount("4555555555555");
        BankAccount bA2 = new BankAccount("5966666666666", 2800.0);
        System.out.println(bA1.nrKonta() + " " + bA1.saldo());
        System.out.println(bA2.nrKonta() + " " + bA2.saldo());
    }
}