package learning.oops.immutableclass;
/*
Immutable Class
Rule of Immutable object
1. Mark my class as final
2. mark instance variable as private and final
3. No setters

If we have any other class object we can able to change their data so the class is immutable

so make a defensive copy

*/


public class Main {
    public static void main(String[] args) {
        College c  = new College("BIt","wardha");
        Student s  = new Student("Gaurva",12,c);
        //after college added (i can able to change the stuff) not purely immutable
        System.out.println(s.getClg().address);
        s.getClg().address = "new adderss";
        System.out.println(s.getClg().address);


        //solution is constructor and getter make a defensive copy (after change bcz we are copy and creating a object in defensive way)
        System.out.println(s.getClg().address);
        s.getClg().address = "new adderss";
        System.out.println(s.getClg().address);


    }
}


//Immutable -> make class final(stop inheriatcne)
final class Student{
   private final String name;
    private final int age;
    private final College clg;

    Student(String name , int age,College clg){
        this.name = name;
        this.age = age;
//        this.clg = clg;
        //make a defensive constructor
        this.clg = new College(clg.name,clg.address);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getClg(){
//        return this.clg;
    //make definsive receviere so that object wont change
        return new College(clg.name,clg.address);
    }
}


//mutable class
class College{
    String name;
    String address;

    College(String name,String address){
        this.name = name;
        this.address = address;
    }
}
