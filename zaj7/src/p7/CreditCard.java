package p7;

import java.time.LocalDate;

public class CreditCard implements Cloneable{
    String cardNumber;
    String holderName;
    LocalDate expiryDate;

    public CreditCard(String cardNumber, String holderName, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("231", "aA", LocalDate.of(2020,1,1));

        CreditCard creditCard2 = null;

        try{
            creditCard2 = (CreditCard) creditCard1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Nie dało się slonować");;
        }

        creditCard2.expiryDate = LocalDate.of(2222, 2, 22);

        System.out.println(creditCard1);
        System.out.println(creditCard2);

    }
}
