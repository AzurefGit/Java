package nwm.Clone.CloneTrue;

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


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
}

class Main4{
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("123", "A", LocalDate.of(2020,12,12));
        CreditCard creditCard1 = null;


        try {
            creditCard1 = (CreditCard) creditCard.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("N u s s...");
        }

        creditCard1.setExpiryDate(LocalDate.of(1999,11,11));

        System.out.println(creditCard.getExpiryDate());
        System.out.println(creditCard1.getExpiryDate());
    }
}