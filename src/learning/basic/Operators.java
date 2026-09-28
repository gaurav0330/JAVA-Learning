package learning.basic;

public class Operators {

    public static void main(String[] args) {
        // Arithmetic (+ - * / %)
        // increment and decrement (i++,i--)
        //relational operator (== ,!= , < ,> , <= , >= )
        // bitwise operator (& ,| , ^ , ~ ,>> ,<< )


        //pre increment and post increment
        int i = 5;
//        i++; //post inc
//        System.out.printf("%d",i);
//        ++i; //pre inc
//        System.out.printf("%d",i);


        int k = i++; //5 used then inc
        int j = ++i; //7 inc then used
        System.out.println(k  + " ," + j);



        //bitwise
//        1.&(and) |(OR)

        int a = 2; //10
        int b = 3; //11
        int c = a&b;
        // 1 0
        // 1 1
        // 1 0 ==> 2
        System.out.println(c);

        //leftshift
//        b = 3
//        0 0 0 0 0 0 1 1
//        0 0 0 0 0 1 1 0
//                  4 2 1
        byte Bans =(byte) (b << 1);
        System.out.println("left shift" + Bans); // 6

        /***
         see this left shift and right shift work on the Int and Long
         not on byte and short bcz when we shift it. it goes from promotion bcz its a operation

         if we do like left shift in byte like say b = 1 and do this for 7th time then asnwer will be -128 but
         as you move from one more bcz byte 8 bit finished answer will be 1 but as integer bcz it promotion to int

         but see when we have -128 and need to store then it convert it into the int but after shifting the reset
         of it will become 1 1 1 1 bcz need to maintain the sign

         Integer.MIN_VALUE === i = 1; i << 31 (negative smalled number in integer)

         after 31 we can do it bcz we lost the MSB so java do the mod with 32 so range is keep in
         0 - 31 always
          ***/


//        logical operator with short circuit (like in and no need to check both condtion if 1st is false) like && or ||

//        but bitwise OR (|) or AND ( & ) dont cause short circuit

//        OPERATOR PRECEDENCE


    }

}
