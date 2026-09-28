package learning.basic;

public class ArraysLec {
    public static void main(String[] args) {
//        declare array
        int[] rollNums = new int[5];

//        storing the values
        for (int i = 0; i < rollNums.length; i++) {
        rollNums[i] = i;
        }

        System.out.println(rollNums.length);

/*
//        multi dimenstional array
        2-D Array --> array of arrays
       2D ---> [
        [1,2,3]
        [1,2,4]
        ]

        use case --> marks table
            E   H  M
            [] [] []
     s1 []  40 30  10
     s2 []
     s3 []
* */

//        number of rows complusoury but col can be optional

        int[][] marks2 = new int[3][];
        marks2[0] = new int[2];
        marks2[1] = new int[3];
        marks2[2] = new int[4];

        int[][] marks = new int[3][3];

        marks[0][0] = 50;
        marks[0][1] = 30;
        marks[0][2] = 90;

        marks[1][0] = 60;
        marks[1][1] = 40;
        marks[1][2] = 80;

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(" " + marks[i][j] + " ");
            }
            System.out.println();
        }
/*
conceptual memory representaion of 2d array

its a contegous memory location (each container is array) means
each block store the array and if we have to go 0 , 0 then 1st blocm and then 0th block inside it

 */
        /*
        datatypes -> premitive and non primitve
        primitve store in the stack memoery via holding directly data

        array is non primitve data(it holds the reference) type its reference variable store in the stack but memory allocate in the heap

        formula for getting memory location
        starting addresss + int(byte)*(location number) ==> 100 + 4*3==> 112

for cpu optimization boolean size is set as 1Byte
        */


// String [] names = new String[3]; what is size of its bcz string is also a non-primitive data type so its store the reference of string

    }
}
