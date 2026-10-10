package learning.advanced.lambdasEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
give important  to behaviour or logic
--> pass a function to a method as an argument
m(do something)

we have comparator interface
has compareTo(T o1, T o2) method

so we can implment by overriding the compare method and write a logic


but we need loosely couple sort method for diff types
for diff sort behaviour we need to build a diff classes for it

to solve this we can use Annoymus class

-->
functional interface
--> only one abstract method
--> multiple static method or default allow


lambda expression
(parameter) --> expression
(s1,s2) --> s1.marks - s2.marks


1. (a,b) -> a + b
2. x -> x*x
3.  () -> sout()
4. (a,b) -> {
return a + b;
}
        */
public class LambdasExDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A",1,10));
        students.add(new Student("B",2,20));
        students.add(new Student("C",3,30));

        Collections.sort(students,(s1,s2)-> s2.marks - s1.marks);
        System.out.println(students);
    }
}

class Student{
    String name;
    int age;
    int marks;

    public Student(String name, int age,int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }
}
