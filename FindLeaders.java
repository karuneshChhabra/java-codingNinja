

//Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
//        Print all the leader elements separated by space and in the reverse order. That means whichever leader comes at last should be printed first.

//5
//        13 17 5 4 6


public class FindLeaders {

    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

        int previous = Integer.MIN_VALUE;


     for(int i=input.length-1;i>=0;i--){

         if( input[i]>= previous){
             System.out.print(input[i]+" ");
             previous = input[i];
         }
     }





    }


    public static void main(String[] args) {
        leaders(new int[]{3, 12, 34, 2, 0, -1});
    }
}