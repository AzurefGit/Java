package z3;

import static z3.NiepoprawnyFormatDanychException.sprawdzFormatDanych;

public class NiepoprawnyFormatDanychException extends Exception{


    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if(dane.contains("@")){
            System.out.println("Jest ok.");
        }
        else {
            throw new NiepoprawnyFormatDanychException();
        }
    }
}

class Main{
    public static void main(String[] args) throws NiepoprawnyFormatDanychException {
        sprawdzFormatDanych("abdc");
    }
}
