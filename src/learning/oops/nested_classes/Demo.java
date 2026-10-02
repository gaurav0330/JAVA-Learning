package learning.oops.nested_classes;

/*
Nested class
A class inside another class

inner class access the variable from it outer class without getter setter

1. inner Static class
-> Outside no static things cant access
-> inner class name change it to static

usecase -->
1 . as helper class for any outer class
2. builder design pattern
3.  if you want ot have a static method inside a static class
4.  Request Res dto


2. Inner class
(in the heap both outer and inner object create in heap and in the inner object there is always a internal refference of outer object)
before java 16 its true that Nonstatic class  cant hold a method static method but after it works

 why not allowed (static method or variable)
  --> if inner have  static variable then for each new object of outer will there be new static variable or same thats confusion

3. Local Class
 --> we can create a class inside any code block is called local class

1. local variable must be final or effectively final cant change in the runtime like int x = 10; x++;(not allowed local class cant access it )
 bcz it cause the ambiguity to use for local class the outer thing/data copy so that use if we change that then how can we copy it

4. Annoymus class (a class without name)
--> particular use case when it only first time
--> no constructor can be made
 */

public class Demo {
    public static void main(String[] args) {
    //access static class

        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner();
        inner.fun(outer);


        // inner class
        // need outer class object here
        OuterNonStatic outerNonStatic = new OuterNonStatic();
//        OuterNonStatic.Inner innerNS = new OuterNonStatic.Inner(); (wrong syntAX)
        OuterNonStatic.Inner innerNs = outerNonStatic.new Inner();

        //short cut (need object of outer class)
        OuterNonStatic.Inner innerNs2 = new OuterNonStatic().new Inner();

        innerNs2.print();

        //static we can call
    OuterNonStatic.Inner.fun2();

    //local class
        OuterLocal outerLocal = new OuterLocal();
        outerLocal.greet();

        Person p1 = new Person(){

            String name = "Gaurav";

            @Override
            void  introduce(){
                //anonoymus class
                System.out.println("i am guest");
                greet();
            }
            //p1.greet() not work but call inside introduce bcz we need to override OK
            void greet(){
                System.out.println("greet");
            }

        };
        p1.introduce();

    }
}


class Outer{
    static  int x = 5;
    //can access or call the method of nested class
    int y = 9;

    void mainFun(){
        Outer x = new Outer();
        //private class access directly here
        Inner.fun2(x);
    }

     static  class Inner{

        static String name;

        void  fun(Outer outer){
            System.out.println("hello " + x);

            //to access y we need object of outer
            System.out.println(outer.y);
        }

        static  void  fun2(Outer outer){
            System.out.println("hello " + x);

            //to access y we need object of outer
            System.out.println(outer.y);
        }


    }
}

class OuterNonStatic {

    int x  = 10;
    class  Inner{
        int x  = 20;
        void print(){
            System.out.println(x);
            //to access the outer class variable
            System.out.println(OuterNonStatic.this.x);

        }

        void  fun(){
            System.out.println("call fun NS");
        }


        // stattic method
        static  void fun2(){
            System.out.println("called fun2 outer ns ");
        }
    }
}

class OuterLocal{
    void greet(){

        class Local{
            void sayHello(){
                System.out.println("Hi ");
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}

class Person{
    void  introduce(){
        System.out.println("i am person");
    }
}

