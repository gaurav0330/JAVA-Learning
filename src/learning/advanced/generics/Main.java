package learning.advanced.generics;
/*
Generics
upcasting is like casting to its upper class
casting to upper class automatic casting
    String s = "OKO";
    Object obj = s;

    //down casting
    Object obj = "OKOK";
    String s = (String) obj;


Bounds we extends <T extends Number> allow to use the methods in the generics class
here T is atLeast number or subtype


*/

public class Main {
    public static void main(String[] args) {

        //store only int
        Box<Integer,String> b1 =new Box<>(1 , "OK"); //type argument
        System.out.println(b1.getValue());
        System.out.println(b1.getValue() + 1);

        //a generics class which store all type of data types
        Box<String,Boolean> b2 =new Box<>("added",true);
        System.out.println(b2.getValue() + " Check check " + b2.getValue2());


        //Object lost the type info,wrong value insert,many erros shift to run t9ime
        //to perform operation we need to down cast into our type but its a extra error

String y = getResult("Hello");
        System.out.println(y);


        Boolean yTrue = getResult(true);
        System.out.println(yTrue);

    }

   public static <T> T getResult( T x){
        return x;
    }


}


//Generic Class
class Box<T,U>{
//T is a placeholder
    private T value;
    private  U value2;
    Box(T value,U value2){
        this.value = value;
        this.value2 = value2;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


//normal class
//class Box{
//    private  int value;
//    Box(int value){
//        this.value = value;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}




