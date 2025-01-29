package z4_Exceptions.npfd;

public class Main {
    public static void main(String[] args) {
        try{
            sprawdzFormatDanych("AAAAa");
        }catch (NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
    }

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(!dane.contains("@")){
            throw new NiepoprawnyFormatDanychException("AAAAA!!!");
        }
        System.out.println("Ok");
    }
}