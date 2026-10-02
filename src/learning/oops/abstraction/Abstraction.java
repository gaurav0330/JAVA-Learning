package learning.oops.abstraction;


/*
THe process of focusing on what something does while ignoring how it does that
--> foucs on behavior

High level Abstraction (separate what from how)
we just define  behavior implements the that behavior in the that particular class -->


INTERFACE --> its a contract
interface class method are abstract no need to mentioned it
no method define all method should define


DIff
Interface
-> pure what (Pure Abstraction)


Abstract
--> Partial What and how

imp ques
1. can abstract class have constructor (yes )
2. can abstract class be final (no bcz it stop from inherit )
3. can abstract class have abstract class/blck/variable (yes)
4. can abstract class have private method (yes)
5. can abstract classes have  a final method yes but non abstract
6. can abstract classes have a no abstarct method (yes )



*/


public class Abstraction {

    public static void main(String[] args) {
        //respective class object call
        Car car1 = new FuelCar(" Gaurav");
        car1.accelarate();
        car1.brake();
        car1.start();

        Car car2 = new ElectricCar();
        car2.accelarate();
        car2.brake();


    }

}


abstract class Car{
    String name;
    Car(String name){
        this.name = name;
    }
    Car(){}


    void start(){
        System.out.println("car started" + name);
    }

    abstract void accelarate();
   abstract void brake();

}

class FuelCar extends  Car{

    //constructor create
    FuelCar(String  name){
        super(name)
        ;
    }

    @Override
    void accelarate() {
        System.out.println("flue car accelarate");
    }

    @Override
    void brake() {
        System.out.println("flue car break");

    }
}


class ElectricCar extends  Car{

    @Override
    void brake() {
        System.out.println("electric car break");
    }

    @Override
    void accelarate() {
        System.out.println("electric accelarate break");
    }
}


interface CarInter{
    void start();
    void accelarate();
    void brake();
}

class FuelCarInt implements  CarInter{
    @Override
   public void accelarate() {
        System.out.println("fuel inter car accelarate");
    }

    @Override
    public void brake() {
        System.out.println("fuel inter car break");
    }

    @Override
    public void start() {
        System.out.println("fuel inter car start");
    }

}