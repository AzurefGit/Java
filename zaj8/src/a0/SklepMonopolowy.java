package a0;

public class SklepMonopolowy {
    public static void main(String[] args) {
        try{
            sprzedajCos();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println(e);
        }catch(e1){
            System.out.println(e1);
        }
    }
    public static void sprzedajCos() throws IllegalArgumentException{
        checkAge(17);
    }
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Niepełnoletni klient");
        }
    }
}
