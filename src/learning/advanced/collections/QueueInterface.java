package learning.advanced.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/*
*        QueueInterface
*       -> Array (need circular array)
*       -> Linkedlist
*
*       java queue --> add--> offer and remove --> poll
*       1. Queue (FIFO)
*         front = -1 (remove)
*          rare = -1 (add)
*       1 2 3 4 5
*       F       R
*
*
*          2.stack (Last in First Out)
*
*           Iterable
*           Collection                              List
*           Queue                                   LinkedList
*           Dequeue (doubly  extend queue)           Dequeue
*   ArrayDequeue class                               LinkedListDequeue
*
*       Doubly ended queue is used as Stack (use ArrayDequeue)
*
*    Internal Implmentation of ArrayDequeue (maintain circularity)
*    resize = original + original/2
*   which is better ArrayDequeue or LinekdList Queue
*   1. ArrayDequeue (cache friendly)
*   2. Array dont allow to add Null as in element  but LinkedList allow it
*
*   why Stack class Not used (its slow and legacy class)

* */
public class QueueInterface {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //as single ended queue  (fail --> memory not get)
        //addition
        queue.add(1); //throw exception if fail
        queue.offer(2); //throw false if fail
        queue.offer(3); //throw false if fail
        System.out.println(queue);

        //front
        System.out.println(queue.peek()); //null
        System.out.println(queue.element()); //exception


        //remove
        queue.remove(); //exception
        queue.poll() ;// false


        //doubly eneded queue
        //add
        queue.addFirst(1);
        queue.addLast(2);
        queue.offerFirst(5);
        queue.offerLast(6);

        //inspect
        queue.getFirst();
        queue.getLast();
        queue.peekFirst();
        queue.peekLast();
        //remove
        queue.pollFirst();


      // stack  -->   queue.offerFirst(5); ,     queue.peekFirst(); , queue.pollFirst()
        //collection has some method but use that methods


        //PriorityQueue (if normal then smallest element first or else largest element first)
        // use Heap data structure --> use complete binary tree (fill left to right )
        /*   minHeap or maxHeap
        Store in Array in real
        left --> 2i + 1
        right 2i + 2

        Heapify algorithm



        * */


        PriorityQueue<Integer> pq = new PriorityQueue<>();







    }
}
