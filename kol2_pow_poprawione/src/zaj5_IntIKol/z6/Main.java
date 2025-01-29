package zaj5_IntIKol.z6;

import java.util.Arrays;

import static java.lang.System.exit;

public class Main {
    public static <T extends Comparable<T>> T maxValue(T[] arr){
        try{
            if(arr.length == 0){
                throw new IndexOutOfBoundsException("Pusta tablica!!!");
            }
            T max = arr[0];
            for (int i = 1; arr.length > i ;i++){
                if(max.compareTo(arr[i]) < 0){
                    max = arr[i];
                }
            }
            return max;
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        Float[] arr2 = {1.2F, 2.2F, 3.3F};
        String[] arr3 = {"a", "b", "b"};

        System.out.println(maxValue(arr));
        System.out.println(maxValue(arr2));
        System.out.println(maxValue(arr3));
    }
}

