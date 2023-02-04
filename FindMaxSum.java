import java.util.Scanner;


public class FindMaxSum {



    public static void main(String[] args) {
        // Write your code here


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pair =sc.nextInt();
        int[] arr = new int[n];
        if (n > pair) {


            for(int i=0;i<n;i++){
                arr[i] =sc.nextInt();
            }

            int max=0;
            int sum =0;

            for(int i =0;i<pair;i++){
                sum += arr[i];
            }

            max =sum;


            for(int i=pair;i<n;i++){
                sum =sum - arr[i-pair];
                sum += arr[i];

               max =Math.max(sum,max);
            }
//
//
//
//            //6 2
//            //2 7 3 6 7 7
//
//            for(int i=0;i<n;i++) {
//                sum =0;
//                for(int j=i;j<i+pair && j<n;j++) {
//
//                   sum +=arr[j];
//                }
//
//                if(max<sum) {
//                  max=sum;
//                }
//
//            }


            System.out.println(max);
        }
    }
}
