package learning.advanced.generics;

import java.util.ArrayList;
import java.util.List;

/*
Generics are invariant in java

if  A is child of B
Generic<A> is not a child of Generic<B>


//wildcard with upperbound

//force full editing with using keyword super <List ? super Animal> Animal upper things needed
//upper bound keyword extend <List ? extend Animal> Animal and Animal subtype allow for reading



TYPE ERASE
-> does jvm knows generic (No)
  source code .java -> byte .class -> JVM (Runtime)
  T types erase and in the byte it T represent as Object

  1. if no Bound -> replace with object
  2. if bound -> replace with bound (extends (Animal) then use that Animal )
  3.  insert cast automatically.
  4.

*/
public class Wildcard {
    public static void main(String[] args) {

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog());
    dogs.add(new Dog());

//    fun(dogs); //not allowed

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Dog());

        fun(animals);


    }

   static void fun(List<? extends  Animal> values){
        for (Animal animal : values){
            animal.eat();
        }

//not allow to add the animal or subtype (modify or adding not possible bcz we can add animal in the list Dog but we can read the ANimal )
//        values.add(new Animal());


    }
}


class  Animal{
    public void walk() {
        System.out.println("Walking");
    }

    public void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    public void bark() {
        System.out.println("Barking");
    }
}

