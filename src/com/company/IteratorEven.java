package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class IteratorEven{

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        iterateAltn(random);
    }

    public static void iterateAltn(List<Float> num) {
        ListIterator<Float> it = num.listIterator(0);
        while(it.hasNext()) {
            if(it.nextIndex() % 2 == 0) it.next();
            else System.out.println(it.next());
        }
    }
}