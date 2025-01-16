package z4;

import java.util.ArrayList;

public class GenericQueue <T>{
    private final ArrayList<T> lista;

    public GenericQueue() {
        lista = new ArrayList<T>();
    }

    public void enqueue(T element){
        lista.add(element);
    }

    public T dequeue(){
        T temp = lista.getFirst();
        lista.remove(0);
        return temp;
    }
}
