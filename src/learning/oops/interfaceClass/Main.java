package learning.oops.interfaceClass;


/*
Interface
we can create  object of interface

1. variable define inside interface
2. Multiple inheritance implement by interface
      P
    /  \
   A    B
    \  /
      C
P,A,B  should be interface so only C can implement

3. interface inheritance


AFTER JAVA 8 --> features
1. we cna define a method in the interface by using default keyword (Default method)
2. static method is also allow
3. private method also added

RESOLUTION PRIORITY RULE
1. interface A (default fun), class B (method fun) and class C extends B implements A
   what happen in C bcz have two same method then priority is called the CLASS METHOD  not interface



 DIFF BTW INTERFACE AND ABSTRACT CLASS
  1. static final variable only  1. any type of variable we can declare
  2. no constructor              2. have constructor
  3. support multiple inheritance 3. not support multiple inheritance
  4. public , private method      4. private public default protected allowed


  Functional interface :- have only one method declare and responsibility of a class to implements it (functional programming)
  Marker Interfaces :- no method in it only act as marker (like Clonable , Serilizable , RandomAcess) (use to mark)

  (internal tag for interface is ACC_Animal)



 */
public class Main {
    public static void main(String[] args) {

//        Random r1 = new Random();
//        r1.fun();

        MathConstant r2 = new Random();
        r2.fun();


        //multiple inheritance
        D d = new D();
        d.fun();


        // JAVA AFTER 8

        //default method
        Vehicle car1 = new Car();
        car1.drive();

        // interface static method
        Vehicle.brake();
    }
}

interface  MathConstant{
    public static final  double PI_VALUE = 3.14;
    int VALUE = 14;
    void fun();

}

class  Random implements MathConstant{
    @Override
   public void fun(){
        System.out.println(MathConstant.PI_VALUE);
    }
}

interface P{
    void fun();
}
interface  A extends P{}
interface  B extends  P{ }

//inherit interface
class D implements A {
    @Override
    public void fun() {
        System.out.println("fun implement in the multiple inheritance");
    }
}






// AFTER JAVA 8 default method,static method , private method
// by using default in the interface you can define as well
// java List Interface --> methods added new method but from stopping force full override they come with default no need to override
//
interface  Vehicle{
    default void drive(){
        iPrivate();
        System.out.println("Default implmentation");
    }
    static void brake(){
        System.out.println("Brake is applied");
    }

    private  void iPrivate(){
        System.out.println("private method in interface");
    }
}

class  Car implements  Vehicle{
// no error drive already define
}
