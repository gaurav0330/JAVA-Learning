package learning.advanced.collections;

import com.sun.source.tree.Tree;

import java.util.*;

/*
Set and Map
in the java there is nothing as Set bcz Map and set has the same feature so behind it use Map


Set implement as
private HashMap<Integer,Object> map = new HashMap<>();

set.add(2)  --> mpa.put(2,PRESENT) private static final PRESENT = new Object();

set.containsKey(2)-> map.containsKey(2)

Set/Map -> map

this NOde is present in the class HashMap{
static class Node {
K key;
V value;
int hash;
Node<K,V> next;
}
}


if map bucket is not empty then :
 1.same value (key already present )(means duplicate) :- hash (by ==) is same and key(equals) is same update the value in map in the set equals method override and check actual value
 2.same index calculate (hashcode % 2) :- go to linkedlist


map.get(key)  -> hascode % bucket size  -> number  go to index then linkedlist traverse

Load Factor (element / capacity) > 0.75 then re hashing
1. create double size array and mod with new capacity and store
initialsize is 16

Tree frication
--> convert into tree (BST ) (logn) (red black tree)

LinkedHashSet /LinkedHashMap (use doubly linkedlist to store order)
--> store the order
--> class Node{
Key
value
hash
next :- normal pointer
before :- which point to before added element
after  :- which point to after added element
}


TreeMap and TreeSet (logn)   use compareTo method
1.use self-balancing BST (Red black tree)
use for
1. key sorted / largest element / smallest element / range query
when its a string use lexico-graphical order (same way in dictionary)


BST
--> smaller value goes to left
--> higher value goes to right

              50
        30           70
    20     40    60     80

set.contains(60) check by value

//methods




* */
public class SetAndMap {
    public static void main(String[] args) {
//constructor
            Set<Integer> set  = new HashSet<>();
            Set<Integer> set1 = new HashSet<>(100);
            Set<Integer> set2 = new HashSet<>(100,0.8f);
            Set<Integer> set3= new HashSet<>(List.of(1,2,3));

            //TreeSet -->
        TreeSet<Integer> treeSet = new TreeSet<>();
            TreeSet<Integer> treeSet2 = new TreeSet<>(List.of(1,2,3,4));
            treeSet.add(1);
            treeSet.add(19);
            treeSet.add(14);
            treeSet.add(111);

            //O(logN)
        //the below methods comes from SOrtable interface
        System.out.println(treeSet.first()); //smallest value
        System.out.println(treeSet.last()); // largest value

        System.out.println(treeSet.headSet(14)); //give me all the smallest element
        System.out.println(treeSet.tailSet(200)); // give me all the largest element

        System.out.println(treeSet.subSet(10 , 1000)); //from inclusive , to is exclusive


        //below method comes from navigator interface
        System.out.println(treeSet.lower(900)); // largest number but smaller than 19
        System.out.println(treeSet.floor(80)); // number which is equal or smaller than current number
        System.out.println(treeSet.higher(10)); // smallest number greater than 10
        System.out.println(treeSet.ceiling(1)); // smallest number greater / equal to  than 1

        System.out.println(treeSet.pollFirst()); //smallest remove from list
        System.out.println(treeSet.pollLast()); // largest remove from list
        System.out.println(treeSet.descendingSet());
        Iterator<Integer>  it  = treeSet.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }


        //Map
        /*
        *               Map
        *           /        \
        *      HashMap       TreeMap
        *        |
        *    LinkedHashMap
        *
        * bcz he doesnt belong to COllection so he define all the method in the Map
        *
        * */


        //Map constructor use LinkedHashMap
        Map<Integer,String >map = new HashMap<>();
        Map<Integer,String >map2 = new HashMap<>(100);
        Map<Integer,String >map3 = new HashMap<>(100,0.8f);
        Map<Integer,String >map4 = new HashMap<>(map);

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        System.out.println("\n "+ "========= MAP ==========");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.hashCode());

        System.out.println(map.containsKey(1)); //O(1)
        System.out.println(map.containsValue("G")); //false O(n)

        System.out.println(map.get(1)); //A
        System.out.println(map.get(1234)); // Null
        System.out.println(map.put(5,"E")); //return null string
        System.out.println(map.put(5,"E Modify")); //return old value E
        System.out.println(map.get(5));

        System.out.println(map.keySet());
        System.out.println(map.values()); //it returns COllection
        System.out.println(map.entrySet()); //key , value return Set<Entry<Integer,String>>
        System.out.println(map.getOrDefault(6,"Unknown"));//its a get operation only
        System.out.println(map.putIfAbsent(6,"New UNkown"));
        System.out.println(map.remove(10,"R"));
        System.out.println(map);

        //map of is immutable

        //treeMap
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"A");
        treeMap.put(2,"B");
        treeMap.put(3,"C");
        treeMap.put(4,"D");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());


        //HashTable (legacy class thread safe) alternate is ConcurrentHashMap
        //Properties extend HashTable (represent configuation data)
        //WeakHashMap --> when we want cache like  behaviour (need WeakRefference)
        //IdentityHashMap --> it compare based on is they really point to same object (a == b )
        //EnumMap --> iteration order is preserved








    }

}
