package learning.oops;
/*
Object size defining
Class Student{
String name;
int age;
int rollNum;
String College;
}

Student s1  = new Student();

OBJECT SIZE
--> Header / object headers (12 byte)
--> Exact field (based on fields) (16 byte)
--> Padding ()

12 + 16 ==> 32 - 28 -->  4byte (padding)

Object header --> store metadata of an object
1. Mark Words (locks info,synchronizetion,grabage collection info etc..) (8 bytes)
2. Class Pointer (store referenace of the object) 4 bytes

Exact data -->

String name; --> 4
int age; --> 4
int rollNum; --> 4
String College; --> 4
(16 byte)


padding -->
adding padding for cpu operation based to make it multiple of 8



CALL BY VALUE AND Call By Reference

1. call by value (cant change the value add by directly passing it wont be change and in java its not possible to change java so everything is call by value)
2. call by reference (we mostly go with by creating an object and then we pass) we cant pass the reference directly

ANS ==> java is call by value bcz when is comes to reference then local variable take the object address perform change and destoy


shallow copy (pointing to the same object ) vs deep copy (new object and value copy )
*/

public class ObjetDive {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println(x + " ," + y);
        addTen(x,y);
        System.out.println(x + " ," + y); //value not change


        //call by reference
        Random r1 = new Random(4,5);
        System.out.println(r1.x + " ," + r1.y);
        addTen(r1);
        System.out.println(r1.x + " ," + r1.y); //value change

    }

    static  void addTen(int x , int y){
     x+=10;
     y+=10;
    }

    static  void addTen(Random r){
        r.x+=10;
        r.y+=10;
    }
}


class Random{
    int x ;
    int y;
    Random(int x,int y){
        this.x = x;
        this.y=y;
    }
}