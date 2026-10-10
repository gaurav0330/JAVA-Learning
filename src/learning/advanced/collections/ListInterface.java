package learning.advanced.collections;


/*
ListInterface
-> ArrayList
-> LinkedList
-> vector
-> stack which extend vector

ListInterface
-> get(index)
-> set(index,E value)
-> add(index,E value)
-> (boolean) addAll(index , Collection<? extends E>)
-> (boolean) remove(index)
-> indexOf(Object o);
-> lastIndex(Object o);
-> listItertor() :- insert,remove,forward,baclword
-> listIterator(index value)
-> list.of(ListInterface) :- make a immutable list
->


*/
public class ListInterface {
    public static void main(String[] args) {

        java.util.List<Integer> l = java.util.List.of(1,2,4,4);
        System.out.println(l);
//        l.add(2); // UnsupportedOperationException

        //Array List
       //  expand like oldcapcity +oldcapcity/2; cache friendly
        //constructor new ArrayList<>(); new ArrayList<>(10); new ArrayList<>(List);
        //ensureCapacity
        //trimtosize()
        //LinkedLIst (singly)
        //vector / stack --> legacy






    }
}
