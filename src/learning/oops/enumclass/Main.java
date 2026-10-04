package learning.oops.enumclass;

/*
to showw status we can use constant so that we can use it directly
normal appraoch problems
1. type safety any value we can add status = 1000;()
2. poor readability
3. duplicate value also allowed success =1 and failed = 1(allowed)


ENUM (enumaration) :- predefined set of constant

conversion --> enum convert into class and override java.langEnum class
 each constant are static and final and are actually objets of class PaymentStatus
 private constructor


 store metadata as well in enum

 PaymentStatus s1 = PaymentStatus.SUCCESS;
 PaymentStatus s2 = PaymentStatus.SUCCESS;
 s1 == s2 equal point to same object

class PaymentStatus extends Enum<PaymentStatus>{
    public static final PaymentStatus  SUCCESS = new PaymentStatus();

    private PaymentStatus(){
    //private constructor
    }

}


predefined method (IMP)
values()        generate by compiler (iterate in the enum )
valueOf(String) generate by compiler (convert a string into enum constant)

name() Enum
ordinal() Enum

values is added by compiler method
its create
final CLassName[] $VALUES = {
NORTH,
SOUTH
}

public static ClassName[] value(){
return $VALUE.clone();
}


 */
public class Main {
    public static void main(String[] args) {

        int status = PaymentStatus2.SUCCESS;
        System.out.println(status);

//        PaymentStatus status1 = "OK"; //not alloweed

        PaymentStatus status1 = PaymentStatus.SUCCESS;
        System.out.println(status1.name());

//        if(status1 == "NEW ADDED"){
//            //it shows error not allowed
//        }

        System.out.println(status1.getValue());

        status1.check();


        // predefined method (helps us to iterate on enum)
        PaymentStatus[] paymentStatuses = PaymentStatus.values();

        for (PaymentStatus p : paymentStatuses ){
            System.out.println(p);
        }

        //create a obj based on the value (case sensitive)
        PaymentStatus newStatus = PaymentStatus.valueOf("SUCCESS");
        newStatus.check();


        //name (cant override)vs toString (override)
        System.out.println(newStatus.name());

        //ordinal() //print index based on we write
        System.out.println(PaymentStatus.PENDING.ordinal());


    }


}

class PaymentStatus2{
    public static final int SUCCESS =1;
    public static final int FAIELD =2;
    public static final int PENDING =3;
}

enum PaymentStatus{


    SUCCESS(1){
        @Override
        public void check() {
            System.out.println("check as success");
        }
    },
    FAILED(2){
        @Override
        public void check() {
            System.out.println("check as failed");
        }
    },
    PENDING(3){
        @Override
        public void check() {
            System.out.println("check as pending");
        }
    };

    //implment abstract as anonums class
    public abstract void check();


    // new variable to intilize bcz public static final PaymentStatus SUCCESS = new PaymentStatus(value : 1);
    private  int value;

   private PaymentStatus (int value){
        this.value = value;
    }

    public  int getValue(){
        return  this.value;
    }


}
