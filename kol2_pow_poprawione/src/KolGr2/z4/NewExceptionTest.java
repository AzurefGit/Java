package KolGr2.z4;

import java.util.Scanner;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(getValidUserInput());
        } catch (InputTooShortException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getValidUserInput() throws InputTooShortException{
        Scanner s1 = new Scanner(System.in);
        System.out.println("Podaj ciag znakow (>4): ");
        if(s1.nextLine().length() < 4){
            throw new InputTooShortException(">4 !!!");
        }
        return "ok";
    }
}
