package learning.advanced.lambdasEx;
/*
we have 4 types functional interface

1. Function (apply)
2. Consumer T -> void (accept)
3. supplier <T> void -> T (get)
4. Predicate <T> (T)-> true/false (test)


 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator c = new Addition();
        print(1,2,c);

        //function T,R
        Function<Integer,Integer> square = (x) -> x*x;
        System.out.println(square.apply(9));

        Consumer<Integer> printX = x -> System.out.println("print "+x);
        printX.accept(1);

        Supplier<Double> randomValue = ()-> Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(1));


        List<Integer> list = new ArrayList<>(List.of(1,2,3,34,4,4,8));
        //foreach take consumer and return void with accept
        list.forEach(x-> System.out.print(x +" "));


        //  IMP --> primitive Functional Interface  old problem (unboxing -  operation -> autoboxing)
        /*
        allow or support primitive functional innterface
        int
        long
        double
        IntFunction <T> (int -> R) R:- object
        LongFunction <T>(int -> R) R:- object
        DoubleFunction <T>(int -> R) R:- object

        ToIntFunction <T> (int -> R) R:- int
        ToLongFunction <T>(int -> R) R:- long
        ToDoubleFunction <T>(int -> R) R:- double

        primitive Consumer Family
        T -> void
        IntConsumer (int -> void)
        LongConsumer  (long -> void)
        DoubleConsumer (double -> void)


        T --> Object
        ObjectIntConsumer (T ,int -> void)
        ObjectLongConsumer  ( T, long -> void)
        ObjectDoubleConsumer (T, double -> void)


        //Primitive supplier (void -> T)
        IntSupplier () -> int
        LongSupplier () -> long
        DoubleSupplier () -> double

         //primitive Predicate
        IntSupplier (int) -> boolean
        LongSupplier (long) -> boolean
        DoubleSupplier (double) -> boolean

        //Primitive Operator Family
        IntUnaryOperator (int) -> int
        LongUnaryOperator (long) -> long
        DoubleUnaryOperator (double) -> double
        */

    }
    public static  void print(int  a , int b,Calculator c){
        System.out.println(c.calculate(a,b));
    }
}

@java.lang.FunctionalInterface
interface  Calculator{
    int calculate(int a , int b);
}


class  Addition implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
