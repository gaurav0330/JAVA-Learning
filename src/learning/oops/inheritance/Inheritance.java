package learning.oops.inheritance;

/*
Inheritance (is a relationship)
code resuability
support polymorphism


Types of inheritance
1. simple inheritance
2. multi level inheritance // A -> B -> C
3. hierarcheal inheritance // hierarcheal like tree or from one node attach all the child
4. multiple inheritance //(not supported in java)
 why multiple inheritance not supported in java
 due to diamond problem  whhen c calls a same class then its problem which one will he refer

 SUPER KEYWORD
 Super it store the reference of parent class
 1. access parent class variable
 2. called parent class method
 3. called parent class constructor

 */
public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.attendLab();
        es.markAttendance();

        Student s1 = new Student();
        s1.markAttendance();
//        s1.attendLab() // error Cannot resolve method 'attendLab' in 'Student'


        //multi level inheritnace
        CSEEngineeringStudent CSE = new CSEEngineeringStudent();
        CSE.markAttendance();
        CSE.attendLab();
        CSE.attendCSELab();


        //heirachical inheritance
        EngineeringStudent EngS= new EngineeringStudent();
        MedicalStudent MEDS= new MedicalStudent();
        EngS.attendLab();
        MEDS.attendLab();

    }

}


// parent (super class )-> child (subclass)

class Student{ //parent
    private  String name;
    private  int age;
    int COUNT = 10;

    void markAttendance(){
        System.out.println("Attendance marked");
    }

}

/*
            A
         /      \
       B         C
*/

class MedicalStudent extends  Student{
    void attendLab(){
        System.out.println("Lab Attended medical");
    }
}

class EngineeringStudent extends  Student{  //child class
    void attendLab(){
        System.out.println("Lab Attended");
        //refer to parent class object
        System.out.println(super.COUNT);

    }
}

class CSEEngineeringStudent extends  EngineeringStudent{
    // student -> engineering student -> CSEEngineering Student (multi level inheritance)
    void attendCSELab(){
        System.out.println(" CSE Lab Attended");
    }
}


/*
NOT SUPPORTED IN JAVA

         A      B
          \    /
             C

 */