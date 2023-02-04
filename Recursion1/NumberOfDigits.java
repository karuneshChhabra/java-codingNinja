import java.util.*;

public  class NumberOfDigits{


//    134/10
//    34/10 --
       //3--> 1

    public static int count(int n){
        //Write your code here

        if(n<10){
            return 1;
        }

        return 1 + count(n/10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
}