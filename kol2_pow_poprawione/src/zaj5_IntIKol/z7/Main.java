package zaj5_IntIKol.z7;

import java.util.Collection;
import java.util.List;

public class Main {
    public static <T extends Number> double sumElements(Collection<T> collection){
        Double suma = 0.0;
        for (T item : collection) {
            suma += item.doubleValue();
        }
        return suma;
    }
    public static void main(String[] args) {
        Collection<Integer> integerCollection = List.of(1, 5, 3);
        Collection<Float> floatCollection = List.of(1.9F, 5.0F, 3.3F);

        System.out.println(sumElements(integerCollection));
        System.out.println(sumElements(floatCollection));
    }
}
