package learning.oops;

public class Basic {
    public static void main(String[] args) {

//        primitive data types
//        byte short int long float double boolean char

        /*
        non primitive -> obeject and custom class with object then its user defined data types
        we have heap and stack memory

        1. All object creation comes in heap (new Student()) (run time new keyword is dynamically memory allocation)
        2. s1 variable assign starting address (its in stack ) so s1 store objection location
        3. s1 is reference variable

class --> starting with capital letter (Student,Human)
function / variable --> camelCase (firstName,firstNameOfStudent)

object --> Characteristics(vairbale/propertise) and behaviour(function)



java almost complete object-oriented programming
         */


        Student s1 ;
        s1= new Student();
        System.out.println(s1); // learning.oops.Student@1b28cdfa

        // ASSIGN A DATA TO OBJECT but value is not assign then set it default
//        s1.name = "Gaurav";
        s1.age = 23;
//        s1.rollNum = 1;
        System.out.println(s1.rollNum);

        //behaviour/function
        s1.study();
        s1.sleep();
        s1.eat();

    }
}



//entity
class  Student{
    // characteristics / properties / data

    String name;
    int age;
    int rollNum;

    // behaviour/ function
    public  void study(){
        System.out.println("i am studying");
    }

    public void sleep(){
        System.out.println("i am going to bed");
    }
    public void eat(){
        System.out.println("i am eat");
    }

}
