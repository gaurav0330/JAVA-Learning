package learning.advanced.streamExperiment;
/*
In the Collection
we have two methods
(override by all the stream)
1. Stream
2. ParallelStream

Stream is a tool for processing a sequence of data through a chain of operations
Streams dont collect data

source --> Intermediate operations(transformation) -> terminal operation

list.stream()  -> source
    .filter()  -> Intermediate (predicate)
    .map()  -> Intermediate (Function)
    .sorted()
    .distinct()
    .skip()
    .toList() -> terminal operation

    no terminal operation --> no streams

Working [5,12,7,20]
1. streams other method works for each value vertically check all the filter for
each value at a time and then move either keep or discard it

2. we do vertical processing
3. lazy loading / lazy evaluation :- only after applying the terminal operator then only start processing the intermediate operation
4. after consumer it destroys the stream

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        //Stream
//        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,10,21));
//
//        Stream<Integer> s = list.stream();
//        s =  s.filter(x -> x <= 10);
//        s = s.map(x -> x+2);
//        s.forEach(System.out::print);

        //Arrays.stream()
//        String[] arr = {"A", "B","C","D","E"};
//        Stream<String> stringStream = Arrays.stream(arr);
//
//        //Stream.of ()
//        Stream<Integer> integerStream = Stream.of(1,2,4,6);

        //EmptyStream stream.empty()

        //infinite Stream --> iterate , generate
        // Stream.iterate(initial , nextFn)
//        Stream.iterate(1,x->x+1)
//                .limit(10)
//                .forEach(System.out :: println);
//
//        Stream.generate(Math::random)
//                .limit(5)
//                .forEach(System.out::println);


        /*
        primitive Stream (bcz of autoboxing / unboxing)
        1.IntStream
        2.DoubleStream
        3.LongStream
        Enable specific operation
        */

        // Experiment
//        List<Integer> list1 = new ArrayList<>(List.of(1,2,2,2,2,2,2,4,36,6,10,63,56,90));
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,4));

        // intermediate function
        // filter
        // map
        // flat (convert nested list into single dimension)
        // sorted() //statefull function
        // distinct() //statefull function
        // skip(5) starting 5 element skip
        // peek() --> Debugging


        //listof terminal operation
// collecting Result
            //toList() :- immutable list
            //collect() :- store in multiple data structure and its mutable
//  Reducing
        // reduce() :- bifunctional (a,b) -> a+b
        // sum() max() min() avg() count()
// searching / matching
        // FindFirst() :- needed filter
        //FindAny
        //anyMatch


        list1.stream()
                .filter(x -> x%2 == 0)
                .map(x  -> x*2)
                .peek(System.out::println)
                .sorted()
                .distinct()
//                .skip()
                .forEach(System.out::println);

        System.out.println("Terminal operations");

        List<Integer> list  = new ArrayList<>(List.of(1,2,4,52,6,26,754,758,68,34));
//     Optional<Integer> integerList =
             OptionalInt integerList =
          list.stream()
                  .filter(x -> x>10)
                .map(x-> x +1)
//                .forEach(System.out ::print);
//                .toList();
//             .collect(Collectors.toSet());
//             .collect(Collectors.toList());
//        .reduce((a,b)->a+b);
//        .count();
//        .findFirst();
//        .findAny();
//        .anyMatch(x -> x > 50);
        .mapToInt(x -> x)
                  .max();
        System.out.println(integerList);


        //Basic of Collectors


    }
}
