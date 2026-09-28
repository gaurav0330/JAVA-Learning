package learning.basic;

/***
type casting is a way to changing the value  one data type into another data type

 1.implicit type casting by automatic or java
 2. explicit typecasting by developer


 widdening
 narrowing

 ***/

public class TypeCasting {

    public static void main(String[] args) {
        //implicit typecasting small data type to large datatype
        // byte -> int
        // char(16bit) -> int(32bit/4byte)
        byte a = 122;
        int implicit = a;
        System.out.println(implicit);

        char text = 'A';
        int implicit2 = text;
        System.out.println(implicit2);


        //explicit typecasting large data type to small datatype
        int b = 300;
        byte explicit = (byte)b;
        System.out.printf("%d\n",explicit);

        //truncating conversion float(32byte)/double (64byte) -> int(32byte)
        float f = 16.25f;
        int i = (int) f;
        System.out.println(i);

        // boolean to any datatype bcz not possible
//        boolean bool = false;
//        i = (int) bool; //can not cast bool into int



        //automatic type promotion happened
//        byte proA = 50;
//        proA = proA * 2; // can not convert from int to byte
////        it can be go to the int after calculation(intermidaiate result can become int so automatic convsersion)

        byte proA = 50;
        proA = (byte) (proA * 2);

/***
 Rules of type promotion
 1. byte short char vALUES are promoted to int
 2. if one operand is long enitre will be long
 3. if one is float, then enitre will be float
 4. if one is double, then enitre will be double
  ***/


    }

}

