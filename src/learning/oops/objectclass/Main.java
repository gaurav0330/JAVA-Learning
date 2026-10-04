package learning.oops.objectclass;

import java.util.Objects;

/*
it in the java.lang package (Object , SYstem)
Object class is parent of all the class in the java
so every class in the java inherit the Object class (so common behavior can pass on)

we can create a object like Object obj = new Student();
(bcz of polymorphism)

Object core methods
1. toString :- string representation of object (default class name and hexa decimal code) and if you override toString then directly print the object
    no need to write .toString()
2. equals :- compare 2 object and return boolean
3. hashcode :- return an integer of an object (hexadecimal format)
    - hashcode if 2 objects are equal then hashcode will be same
4. getClass

cloning
1 . clone() :- Clonable interface should be implements (bcz not every object should be clonable) interface Clonable is empty no need to any method (Marker Interface)
     it do shallow copy

Garbage Collection
1.finalize() :- used earlier in GC (unpredictable,unsafe,unreliable)

Threads
1. Wait();
2. Notify();
3. NotifyAll();


*/
public class Main {
    public static void main(String[] args)  throws  CloneNotSupportedException{
        Student s1 = new Student("Gaurav",12);
        System.out.println(s1.toString());

        //equals default implmentation compare two refernece
        Student s2 = new Student("Gaurav",12);
        System.out.println(s1.equals(s2));

        Student s3  = null;
        System.out.println(s1.equals(s3)); //null pointer exception


        Integer  i  = 12;
        System.out.println(s1.equals(i)); //ClassCast Exception

        //hash code method
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String t = s1.getClass().getSimpleName();
        System.out.println(t); //no override public final native Class<?> getClass()


        //instance of operator --> Check if an object is instace of class or any of its subclass

        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Object);


        Student Sclone = (Student) s1.clone();
        System.out.println(Sclone);
    }
}



class  Student extends  Object implements Cloneable{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return  true;
        }

        if(obj != null &&  obj.getClass() == this.getClass()) {
            Student s  =(Student) obj;
            return (this.name == s.name && this.age == s.age);
        }

        return false;

    }

    @Override
    public int hashCode() {
        //first compare equal so that on that basis it works
//        int results = 17;
//         results = results*31 + age;
//         results = results*31 + ( (name == null) ? 0 :name.hashCode());
//        return results;
        return Objects.hash(name,age); //same implmentation as above
    }

    @Override
    protected Object clone() throws  CloneNotSupportedException{
        return  super.clone();
    }


}

