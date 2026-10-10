package learning.advanced.collections;

import java.util.*;

/*
Collection -> interface
Collections --> class




* */
public class CollectionDepth {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);c.add(2);c.add(3);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(c.contains(2));

        //object toArray(); :- limited to only object method
        Object[] obj = c.toArray();
        for(Object o :obj){
            System.out.println(o);
        }

        // T[] toArray(T[] a)

        Integer[] arr = c.toArray(new Integer[0]);
        System.out.println("To array with T");
        for(Integer i : arr){
            System.out.println(i);
        }

        //boolean add(T a)
//        for false we use hashset
        Collection<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        boolean b = set.add(2);
        System.out.println(b); //false


        //boolean remove(Object obj ) first occurance remove
        System.out.println(c.remove(3));

        //boolean addAll( Collection<? extends E> c)
        c.addAll(List.of(1,2,4,56,6,7));
        System.out.println(c);

        System.out.println(c.containsAll(List.of(1,2)));

        //boolean retainAll work like intersection





    }
}
