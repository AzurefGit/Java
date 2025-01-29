package zaj5_IntIKol.z5;

import java.util.Arrays;

import static java.lang.System.exit;

public class Main {
    public static <T> void swap(T[] arr, int i1, int i2){
        try{
            T temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            exit(-1);
        }

    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
}
