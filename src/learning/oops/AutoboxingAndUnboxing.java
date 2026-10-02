package learning.oops;

/*
autoboxing and unboxing

1. Autoboxing
  int -> Integer (automatically)
  int x = 10;
  Integer y = x (works automatically)
  Integer y = new Integer(x); (old way of doing stuff)

  Integer y = Integer.valueOf(x) (morden) use caching in background

2. Unboxing
  Integer x  = 10;
  int y  = x;

  int y = x.intValue();

works in
Assignments
method call
parameters

 */

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        // 1. Autoboxing (Primitive to Wrapper Object)
        int x = 10;
        Integer y = x; // The compiler automatically converts this to: Integer.valueOf(x);

        // 2. Unboxing (Wrapper Object to Primitive)
        Integer a = Integer.valueOf(20); // Note: 'new Integer()' is deprecated since Java 9
        int b = a; // The compiler automatically converts this to: a.intValue();


        //null pointer exceptions
//        Integer j = null;
//        int k = j;


        Integer  ab = 200;
        Integer cd = 200;
        System.out.println(ab == cd); //false bcz out of the cache range (-128 to 127)

        System.out.println(ab.intValue() == cd.intValue()); //true

        System.out.println(ab.equals(cd));


    }

}
