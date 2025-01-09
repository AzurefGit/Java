package z2;

import java.util.ArrayList;
import java.util.List;

public class Counter<T>{
    private List<T> elements;

    public Counter() {
        elements = new ArrayList<>();
    }

    public void add(T element){
        elements.add(element);
    }

    public void getCount(){
        System.out.println(elements.size());;
    }
}
