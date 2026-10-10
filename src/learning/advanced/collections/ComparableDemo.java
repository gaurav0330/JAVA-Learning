package learning.advanced.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
/*
comparable interface implements it a override the compareTo method
use via Collections.sort(list);


in the treeset or treeMap (bcz value wise comparision bcz it overidde the equal method)
but build the proper compreTo to solve the problem

we also have comparator learn in lambda


Collections have Utility method with static we can use it
*/


// Renamed class to avoid conflict with java.lang.Comparable
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("C", 3));
        list.add(new Student("A", 1));
        list.add(new Student("B", 2));
        list.add(new Student("AC", 2));

        // Sorts the list based on the logic defined in Student.compareTo
        Collections.sort(list);
        System.out.println(list);

        //treeset implmenetation bcz it add only one value
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("A",1));
        treeSet.add(new Student("B",1));
        System.out.println(treeSet.size());

//Collections.unmodifiableList()
//Collections.emptyList() / emptySet , emptyMap



    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // STEP 1: Must implement the compareTo method
//    @Override
//    public int compareTo(Student other) {
//
//        if(this.marks != other.marks){
//            // Sorts by marks in ascending order
//            return this.marks - other.marks;
//            // -1 --> small come first
//            // 0 equal
//            // +1 --> second number is small
//            //accending --> this.marks - other.marks
//            //deseending --> other.marks - this.marks
//        }
//        return this.name.compareTo(other.name);
//         }



    //for override
    @Override
    public int compareTo(Student other) {
            // Sorts by marks in ascending order
            return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}
