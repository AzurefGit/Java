package z4_Exceptions.npfd.s2;

import z4_Exceptions.npfd.NiepoprawnyFormatDanychException;

public class Main {
    public static void main(String[] args) {
        try {
            sprawdzFormatDanych("Aaa");
        }catch (NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
    }

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(!dane.contains("@")){
            throw new NiepoprawnyFormatDanychException("Nie ok");
        }
        System.out.println("ok");
    }
}
