package learning.oops;

/*
Encapsulation --> adding things into one capsule

To represent any enitity be have data and behaviour so it should be in single container

RULES
1.  Both data and behaviour should be together encapsulated within an object
2. We should not provide  unrestricted access of data (restriction of data)


to give acess we need ACCESS MODIFIER
who have access to
-> variable
-> method
-> constructor
-> class

1. public
2. default
3. protected
4. private

package --> in a file we have multiple class and any one of them is public bcz it has main function
package is a folder which store multiple classes

definition --> A package group similar classes/interface together

PRIVATE --> only accessible inside a class (variable and method can be private)
DEFAULT --> inside same package can access (double bankAccount ) so its a default access modifier
Protected --> same package and inherited class
public --> anyone can access


class cant be private or protected
why --> class ke bahar access nahi kr skta
inheritance --> apply on variable and method not class


*/

public class Ecapsulation {
    public static void main(String[] args) {
        System.out.println("h");
    }
}

class BankAccount{
private double balance;
String bankName;
String IFSC;

    public void deposit (int amt) {
        balance += amt;
    }

    public void withdraw (int amt) {
        balance -= amt;
    }

    //getter setter
    public double getBalance() {
        return balance;
    }

}