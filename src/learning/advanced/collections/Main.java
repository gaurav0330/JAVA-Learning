package learning.advanced.collections;
/*
        Object
           |
       Iterable
          |
       Collection
  |        |      |           |
 ListInterface    Set     Queue        Map



Data structure are
Order maintaining    :-  ArrayList Linkedlist
Not Order maintaining  :-  set map satck/queue

Iterable
|==> iterator  has hasnext() next() method remove()
| ==> foreach
| ==> Split Iterator
| ==>
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list  =new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);

       Iterator<Integer> it= list.iterator();
       while (it.hasNext()){
//           if(it.next() == 3){
//               list.remove(it.next()); //con current modification error failed fast
//           }

           System.out.println(it.next());
       }



    }
}
