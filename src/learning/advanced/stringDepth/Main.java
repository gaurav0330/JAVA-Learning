package learning.advanced.stringDepth;

/*
String Class is Immutable means (no setters class and methods are final only constructor and getter)
String declare
-> Literal
-> new


== --> compare the reference
eqauls --> compare the refernce but override in the String so its check the value


GOLDEN RULES
1.only compile time constants go to the string pool automatically
2. Runtime created string go to heap


case 1 :
        String s1 = "ja" + "va"; (compiler time constant) (stringpool)
        String s2 = "java";
        (s1 == s2) //true

case 2 :
        String s1 = "ja"; //compiler time (stringpool) ja , va(no reference) in the string pool
        String s2 = s1 + "va"; // runtime create in the heap
        String s3 = "java";
        s2 == s3 // false bcz s2 in heap and s3 instringpool
case 3 :
       String s1  = "java";
       String s2  = s1;
       s1 == s2 //true (its a compile time)

case 4 :
        String s  = new String("Hello"); // bcz its a liternal then it goes to the stringpool but no point and s will point in the heap




CONSTRUCTOR IN STRING



METHODS IN STRING
1. Length/Emptitness
-> length()
-> isEmpty()
-> isBlank() check the character

2. character access
-> chartAt(index)
-> toCharArray() :- s1.toCharArray()


3.comparison
 -> s1.equals(s2) :- check value
 -> s1.compareTo(s2) :- lexical comparison int how much first is small or big
 -> s1.equalsIgnoreCase(s2)


4. Searching
-> s1.contains("g") :- case sensitive
->  s1.indexOf("G")
-> s1.startsWith("L")
->

5. Extractionn/Transformation
-> s1.substring(start,end);
->


 */

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        //string declaration literal
//        String sL1 = "Hello"; //create a stringpool(part of heap) and same value string store there point to the same object
//        String sL2 = "Hello";
//        System.out.println(sL1== sL2); // true bcz reference compare
//
//        System.out.println(sL1.equals(sL2)); //true compare value
//        //string declaration new
//        String sN1 =  new String("Hello"); // not store in the stringpool always create  a new object in the heap memory
//        String sN2 =  new String("Hello");
//
//        System.out.println(sN1 == sN2); // bcz reference not shared
//        System.out.println(sN1.equals(sL1)); //true compare value override by string




        //constructor (to test above just uncommment above and comment below)
//        String s1  =new String(); //out nothing print
//        String s1 = new String(""); //out nothing print
//        String s1 = new String("Hello"); //out Hello

//        String s1 = new String("Gaurav");
//        String s2  = new String(s1); //Gaurav

//        char[] arr= {'G','A','U','R','A','V',};
//          String s1  = new String(arr);
//        System.out.println(s1); //GAURAV



        char[] arr= {'G','A','U','R','A','V',' ','J','I','K','A','R'};
//        constructor (arr,offset(inclusive) ,count(exclusive))
          String s1  = new String(arr,0,6);
        System.out.println(s1); //GAURAV


        byte[] arr2 = {97,98,99};
        String s2 = new String(arr2);
        System.out.println(s2); //abc

        // rest is new String(StringBuilder) and new String(StringBuffer)


        //METHODS
        //length
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());


        //character access
        System.out.println(s1.charAt(3));
        System.out.println(s1.toCharArray());

        //comparing
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2)); //lexical graphical comparison



        //searching
        System.out.println(s1.contains("g"));
        System.out.println(s1.indexOf("G"));
        System.out.println(s1.lastIndexOf("A"));
        System.out.println(s1.startsWith("L"));


        //Extractionn/Transformation
        System.out.println(s1.substring(0,3)); //[0,3) --> 0 1 2
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println("   Gauar   k".trim()); //remvoe front and back space
        System.out.println(s1.replace("G","N"));
        System.out.println(s1.replace("GA","N"));

        System.out.println(s1.replaceAll("G"," "));

        String[] Arr = "gaurav , jikar , check".split(",");
        for (String s : Arr){
            System.out.print(s);
        }
        System.out.println();

        System.out.println(String.join("-",Arr));

        //conversion
        String con = new String(String.valueOf(10));
        System.out.println(con);
        System.out.println(s1.getBytes());


        //Advance method intern() copy new string obj into stringpool , format() :-
        String adv = new String("Hello");


        //AbstractStringBuidler below are child (java.lang package)
        //Stringbuilder (is not thread safe)
        //String Buffer  (is thread safe)


        //StringBuilde use 16 as store and extend it goes with 16*2 + 2 --> 34 and so on
        // Stringbuilder doesnt override the equal metjod


        StringBuilder sb = new StringBuilder();
        sb.append("Gaurav");
        sb.append("jikar");
        sb.insert(0,"id-");
        sb.delete(0,3);
        sb.deleteCharAt(1);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.trimToSize();
        sb.append("c");
        System.out.println(sb.capacity());
        System.out.println(sb);





    }
}


