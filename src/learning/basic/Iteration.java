package learning.basic;

import java.util.Arrays;

public class Iteration {
//    looping statement
//    while , do while , for
        public static void main(String[] args) {

//            int i = 1;
//            while(i <= 10){
//                System.out.println(i);
//                i++;
//            }


//            for(; ;){
//                // work bcz its three part are optional
//            }

            for (int i = 0, j = 0; j <= 10 && j < 5; i++ , j++) {
                System.out.println(i * j);
            }


//            for (byte i = 0; i < 10; i++) {
//              but it change to int bcz of type promotion
//            }

//            NESTED LOOP
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }






        }

}
