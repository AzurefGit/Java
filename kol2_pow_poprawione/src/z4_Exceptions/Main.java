package z4_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Podaj 1. liczbę: ");
                int num1 = sc.nextInt();
                System.out.println("Podaj 2. liczbę: ");
                int num2 = sc.nextInt();
                int res = num1/num2;
                System.out.println(res);
                break;
            }catch (ArithmeticException e){
                System.out.println("Nie dziel przez zero!!! Spr. ponownie...");
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Wprowadź li całkowitą!!! Spr. ponownie...");
                sc.nextLine();
            }

        }
        sc.close();
    }
}