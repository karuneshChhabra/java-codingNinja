import java.util.Scanner;

class Scratch {



    public static void print(int n) {
        //Write your code here

//        4444444
//        4333334   i=1,j=2  num -3

//        4322234    i=2,j=3
//        4321234
//        4322234
//        4333334
//        4444444
        int num=n;
        int value=n+n-1;
        int k=num;
        for(int i=0;i<value;i++){


            for(int j=i;j<value;j++){
                System.out.print(num);

            }
            num--;
            for(int j=0;j<i;j++){
//                if(j==0) {
//                    System.out.print(num+1);
//                }else {
                    System.out.print(num);
               // }

            }
            num++;
            System.out.println();
        }

    }



    public static void main(String[] args) {
        //    print(4);
       // print(3);

         java.lang.String str = "abc";
         System.out.println(str.substring(1));
//        Scanner sc = new Scanner(System.in);
//
//        int value = sc.nextInt();




//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String[] arr = new String[n];
//
//        for(int i=0;i<n;i++){
//            arr[i]= sc.next();
//
//        }

    }
}