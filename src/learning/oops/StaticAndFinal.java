package learning.oops;

/*
when we have to define a characterstic as in the global level bcz its same for  that entity then we can declare it as static is class property

Static is class variable / class method  / (specific to class)

static method ==>
1. one static method can call other static method (bcz its is already define and use without object creation )
2. static method can only access static variable (bcz already available )
3. does not have access of this keyword (bcz it store current obj reference)

As the application launch static block execute and initialize it

IMP
1. parameter cant be static  (bcz this is local variable)
2. class cant be static (but nested class can be)


FINAL
declaration and intilization in same line but changing is allowed once bcz java does some optimization on it
ALL ARE ALLOWED
1. variable
2.method
3. class
4. parameter


why main is static in java ==> bcz it allow jvm to call main method without creating a object

why String[] args ==> to take an input we need string args like earlier we run code via terminal to pass argumnet we pass in string
// java Demo5 input.txt output.txt

*/

public class StaticAndFinal {
    public static void main(String[] args) {

        IronSuit j1 = new IronSuit("Mark 1",1);
        IronSuit j2 = new IronSuit("Mark 2",2);
        System.out.println(j1.name + "," + j1.model + "," + IronSuit.companyName);
        System.out.println(j2.name + "," + j2.model + "," + IronSuit.companyName);


        final int x ;
        x = 5;
//        x =4; // error like already assigned

    }
}

class  IronSuit{
    String name;
    int model;
    static String companyName;
    static  double version ;

//    final double PI_VALUE =  3.14; // cant change it is fixed (constant)

//  static   final double PI_VALUE =  3.14; // directly acessible


    static  {
        companyName = "GJ";
        version = 1.0;
    }

    IronSuit(String name,int model){
        this.name = name;
        this.model= model;
    }

    static void markDone(){
        System.out.println("Marked Done");
    }

    //static block --> allow all the value in the static block to become static
    // intilize the value here dont declare it



}


