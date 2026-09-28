package learning.oops;

/*
        NOTES

a method define in the class is known as instance method (heap)
a variable define in the class is known as instance variable (heap) have default value
int -> 0
float/double -> 0.0
boolean -> false
String -> null (bcz its object)

Constructor --> TO create an object
RULES
1. same name as class
2. no return type not even void
3. automatically called  during object creation
4. used to initilize an object
5. it can be overloaded


this --> store the current object reference


Constructor chaining
--> creating diff type of constructor based on the parameter that we passed
Avoid null value always try to assign default


Constructor chaining -->
here calling first then till last then return from there in reverse order

NOTE--> we cant called constructor manually

error --> while creating an object in runtime we may not get space to create an object (runtime exception when enough space is not available)


*/
public class Constructor {

    public static void main(String[] args) {
        int x = 4; // stack,local variable, no default value

        Car c3 = new Car();
        Car c2  = new Car("desire");
        Car c1 = new Car("platina",10,"model",true);

//
//        System.out.println(c1); // same as this value same
//        System.out.println(c2); // same as this
//        System.out.println(c3); // same as this

    }
}

class Car{
    String name;
    int engine;
    String model;
    boolean licence;

    Car(){
        //default constructor
//        this.name = "Unkown";
//        this.engine =0;
//        this.model = "default mdoel";
//        this.licence = false;
        this("Unkown", 0, "Default Model", true);
        System.out.println("i am first contructor");
    }

    Car(String name){
        //for this you to build the complete one constructor which takes all the value
        this(name, 0, "Default Model", true);
        System.out.println("i am second contructor");

    }

    Car(String name ,String model){
        //for this you to build the complete one constructor which takes all the value
        this(name, 0, model, true);
        System.out.println("i am third contructor");

    }

    //constructor
    Car( String name,int  engine, String model,boolean licence){
        this.name = name;
        this.engine = engine;
        this.model= model;
        this.licence =licence;
        System.out.println("i am last  contructor");

    }

}


