package oddEl;

public class oddEl {
    public static int oddElementsSum(int[] tab){
        int suma = 0;
        for(int i = 0 ; i < tab.length ; i++){
            if(tab[i] % 2 != 0){
                suma += tab[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] tab = {7,5,7,1,2};
        System.out.println(oddElementsSum(tab));
    }
}
