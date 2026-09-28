package learning.basic;

public class Functions {
    static int sum(int i ,int j){
            return i + j;
    }

    static int sum(int i ,int j,int k){
        return i + j + k;
    }

    static double sum(double i ,int j){
        return i + j;
    }

    public static void main(String[] args) {
/*
    A function is  a set of or block of code which perform some specific options
 */
        int i = 4 , j = 5;
        int res = sum(i,j);
        System.out.println(res);

        //function overloading same name but diff parameter()
        System.out.println(sum(1,2,3));

        System.out.println(sum(1.0,6));

    }


}
