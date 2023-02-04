import java.util.*;
import java.lang.*;

class FaultyWords{

//    2
//    code
//            cooodeee
//    hello
//            hheeeloo


    public static boolean compareTwoString(String str1, String str2) {
        // Write your code here.

        if (str1.length() > str2.length())
            return false;


        if(str1.length() == 0 && str2.length()==0){
            return false;
        }



        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        if(strArr1[strArr1.length -1]!=strArr2[strArr2.length-1]){
            return false;
        }


        int j=0;
        int i=0;

        for(;i<strArr1.length && j<strArr2.length;){
            if(strArr1[i] ==strArr2[j]){
                //character match
                i++;
                j++;
            }else if(i>0 && strArr2[j] == strArr1[i-1]){
                j++;
            }else{
                return false;
            }


        }

        for(;j<strArr2.length;){
             if(strArr2[j] != strArr1[i-1]){
                return false;
            }
             j++;
        }

        //  return new_string;

       return i < strArr1.length ? false : true;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // n--> cases
        int n = sc.nextInt();

        String[] arr = new String[2*n];


        // All string added;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();

        }




        for(int i=0;i<arr.length;i=i+2){
            System.out.println(compareTwoString(arr[i],arr[i+1]));
        }

    }
}