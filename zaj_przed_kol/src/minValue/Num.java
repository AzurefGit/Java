package minValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Num {
    public static Double minimumValue(ArrayList<Double> arr){
        double min = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Double[] tab = {5.25,-12.1, 0.0, 5.5, 1.2};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(tab));
        System.out.println(minimumValue(list));
    }
}


