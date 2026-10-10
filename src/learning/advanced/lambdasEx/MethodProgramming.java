package learning.advanced.lambdasEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Method Reference
(x) -> sout(x) (Consumer)

functional composition
break complex function into smaller function




 */
public class MethodProgramming {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,34,7,4,6,7,7,2));
        //(x) -> sout(x) use this method when need
        //ClassName::MethodName
        list.forEach(System.out::print); //method reference

        System.out.println();
        //(x + 2) * 3
//        Function<Integer,Integer> eq = x -> (x+2)*3;

        Function<Integer,Integer> add2 = x -> (x+2);
        Function<Integer,Integer> multiply3 = x -> (x*3);
        Function<Integer,Integer> divide3 = x -> (x/3);

        System.out.println(multiply3.apply(add2.apply(1)));

        int ans = add2.andThen(multiply3).andThen(divide3).apply(2);
        System.out.println(ans);

    }
}
