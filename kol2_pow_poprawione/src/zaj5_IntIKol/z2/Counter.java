package zaj5_IntIKol.z2;

import java.util.ArrayList;

public class Counter<T>{
    ArrayList<T> tArrayList = new ArrayList<>();

    public void add(T element) {
        this.tArrayList.add(element);
    }

    public void getCount(){
        System.out.println(tArrayList.size());
    }
}

class Main{
    public static void main(String[] args) {
        Counter<String> stringCounter = new Counter<>();

        stringCounter.add("aaa");
        stringCounter.add("bbb");
        stringCounter.add("ccc");

        stringCounter.getCount();
    }
}