package fundamentals;



import java.util.HashMap;
import java.util.Scanner;


public class Main {
//
////    public static double factorial (double n){
////
////
////
////        double factorial_num =1.0;
////
////
////        while (n>1){
////            factorial_num =factorial_num * n;
////            n--;
////
////        }
////        return factorial_num;
////
////
////
////}
//
//    public static double factorial(double num){
//        int fact=1;
//        for(int i=2;i<=num;i++){
//            fact*=i;
//        }
//        return fact;
//    }
//
//
//    public static int probability(int n,int x) {
//
////        Ns=factorial(8.0)/(factorial(n*1.0)*factorial(8.0-n));
////        Ne1=factorial(4.0)/(factorial(x*1.0)*factorial(4.0-x));
////        Ne2=factorial(4.0)/(factorial(((n-x)*1.0))*factorial((4.0-(n-x))));
//
//
////        double ns= factorial(8.0)/(factorial(8.0-n)*factorial(n*1.0));
////        double n1= factorial(4.0)/(factorial((4.0-x)*factorial(x*1.0));
////        double n2= factorial(4.0)/(factorial((n-x)*1.0)*factorial((4.0-(n-x))));
//
//
//
//        double ns=factorial(8.0)/(factorial(n*1.0)*factorial(8.0-n));
//        double n1= factorial(4.0)/(factorial(x*1.0)*factorial(4.0-x));
//        double n2= factorial(4.0)/(factorial(((n-x)*1.0))*factorial((4.0-(n-x))));
////         int pe=(int)(((n1*n2)/ns)*100);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(ns);
//
//
//
//
//        int pe = (int)((((n1*n2)*1.0/ns))*100;
//
//
//        return pe;
//    };

    public static int sumNumbers(int[] numbers){
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            //sum = sum + numbers[i];
            System.out.print(numbers[i]+" ");
        }
        return sum;
    }

    public static int[] inputNumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int linearSearch(int arr[], int x) {
        //Your code goes here

        for(int i=0;i<arr.length;i++){
            if(arr[i] ==x){
                return i;
            }
        }
        return -1;
    }
    public static void arrange(int[] arr, int n) {
        //Your code goes here

        int num=1;
        int even=2;
        int odd = n-(n/2);

        for(int i=0;i<odd;i++){
            arr[i]=num;
            num=num+2;
        }

        for(int i=n-1;i>odd-1;i--){
            arr[i]=even;
            even=even+2;
        }

//        for (int i=n/2;i<n;i++){
//            arr[i]=num;
//            num = num-2;
//        }
//        for(int i=0;i<=n/2;i++){
//System.out.println(i);
//            System.out.println("num"+num);
//            arr[i]= num;
//            if(i!=(n-1-i)) {
//                arr[n - 1 - i] = ++num;
//            }
//            num++;
//        }

        sumNumbers(arr);
    }

    public static int[] swapAlternate(int arr[]) {
        //Your code goes here

        int temp;
        for(int i=0;i<=arr.length-2;i=i+2){
            temp= arr[i];
            arr[i]=arr[i+1];
            arr [i+ 1] = temp;
        }
        return arr;

    }


    public static int findUnique(int[] arr){

        HashMap< Integer, Integer> values= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(values.containsKey(arr[i])){
                values.put(arr[i],values.get(arr[i])+1);
            }else{
                values.put(arr[i],1);
            }

        }
        System.out.println(values);

        for (int value:values.keySet()){
            if(values.get(value)==1){
                return value;
            }
        }
        return 0;


        //Your code goes here
    }


    public static int duplicateNumber(int arr[]) {
        //Your code goes here

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    return arr[j];
                }
            }
        }

        return Integer.MAX_VALUE;
    }

//
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int pair =sc.nextInt();
//    int[] arr = new int[n];
//         if (n > pair) {
//
//
//        for(int i=0;i<n;i++){
//            arr[i] =sc.nextInt();
//        }
//        int k=0;
//
//        Arrays.sort(arr);
//        int sum =0;
//
//        for(int i=arr.length-1;i>0;i--){
//            sum+=arr[i];
//            k++;
//            if(k==pair){
//                break;
//            }
//
//        }
//        System.out.println(sum);
//    }

    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here
//        int limit = arr2.length;
//        if(arr1.length>arr2.length){
//            limit = arr1.length;
//        }

        int[] new_arr= new int[arr2.length];
        new_arr=arr2;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<new_arr.length;j++){
                if(arr1[i]==new_arr[j]){
                    System.out.print(arr1[i] +" ");
                    new_arr[j] =-1;

                    break;
                }
            }
        }
//        for(int j=0;j<arr2.length;j++){
//            for(int l=0;l<new_arr.length;l++){
//                if(arr2[j]==new_arr[l]){
//                    System.out.print(new_arr[l] +" ");
//                    break;
//                }
//            }
//        }
    }

    public static int pairSum(int arr[], int x) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(x==arr[i]+arr[j]) {
                    count++;


                }

            }

        }
        return count;
    }

    public static int findTriplet(int[] arr, int x) {
        //Your code goes here
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (x == arr[i] + arr[j]+arr[k]) {
                        count++;


                    }

                }
            }
        }
        return count;
    }

    public static void sortZeroesAndOne(int[] arr) {
//        //Your code goes here
//        int n =arr.length;
//
//        int i=0;
//        int j= n-1;
//        while(j>i){
//            if(arr[i]==1 && arr[j]==0){
//                arr[j]=1;
//                arr[i]=0;
//                i++;
//                j--;
//            } else if (arr[i]==1) {
//                j--;
//            } else if (arr[j]==0) {
//                i++;
//            }else{
//                i++;
//                j--;
//            }
//
//
//        }
//        System.out.println();


        int nextZero= 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                nextZero++;

            }

        }

    }


    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int start =0;
        int end =arr.length-1;

        while (start<end){

            if(arr[start]==x){
                return start;
            }
            if(arr[end]==x){
                return end;
            }

            int mid =(start+end)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                end = mid-1;
            }else{
                start = mid+1;
            }



        }
        return -1;
    }



    public static void selectionSor(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static void selectionSort(int[] arr){

        int minIndex= -1;

        for(int i=0;i<arr.length-1;i++){
            int minElem  =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<minElem){
                    minIndex =j;
                    minElem=arr[j];
                }

            }
            System.out.println(minElem);

            int temp=arr[i];
            arr[i] =arr[minIndex];
            arr[minIndex] = temp;
            sumNumbers(arr);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //int a=10,b=-20;
        // System.out.println(a^b);

        int[] arr = {2, 13 ,4, 1, 3, 6, 28,5};
        // selectionSort(arr);
//        sumNumbers(arr);
//        System.out.println();
        bubbleSort(arr);
        sumNumbers(arr);

//        int[] arr = new int[]{9, 3, 6, 12, 4, 32, 5, 11, 19};
//        arr= swapAlternate(arr);
//        sumNumbers(arr);
//
//        System.out.println();
//        int[] arr2 = new int[]{9, 3, 6, 12, 4, 32, 5, 11};
//        arr2= swapAlternate(arr2);
//        sumNumbers(arr2);





        // System.out.println();

//        int[] arr1 = new int[]{2, 6, 1, 2};
//        int[] arr2 = new int[]{1, 2, 3, 4, 2};

//        int[] arr1 = new int[]{2, 6, 8, 5, 4, 3};
//
//        int[] arr2 = new int[]{2, 3, 4, 7 };

//        int[] arr1 = new int[]{1 ,3 ,6 ,2 ,5 ,4 ,3, 2, 4};

//        int[] arr1 = new int[]{2 ,-5, 8, -6, 0, 5, 10, 11, -3};

        // int[] arr1 = new int[]{1, 0, 1, 1, 0, 1, 0, 1};


//        int[] arr1 = new int[]{  1, 2, 3, 4, 5, 6, 7};
//
//
//        System.out.println(binarySearch(arr1,1));
//
//        System.out.println(binarySearch(arr1,2));
//        System.out.println(binarySearch(arr1,3));
//        System.out.println(binarySearch(arr1,4));
//        System.out.println(binarySearch(arr1,5));
//        System.out.println(binarySearch(arr1,6));
//        System.out.println(binarySearch(arr1,7));
//        System.out.println(binarySearch(arr1,9));


        // sumNumbers(arr1);

        // int[] arr2 = new int[]{ 1, 3, 6, 2 ,5 ,4 ,3, 2, 4};
        //System.out.println(findTriplet(arr1,10));
        //  System.out.println(pairSum(arr2,12));
//        int[] arr2 = new int[]{10};
//        intersections(arr1,arr2);
        //System.out.println(duplicateNumber(arr2));
        //sumNumbers(arr2);


//        System.out.println(linearSearch(arr,9));
//        int[] arr = new int[9];
//        arrange(arr,9);
//System.out.println();
//      //  1 3 5 6 4 2
//        int[] arr2 = new int[6];
//        arrange(arr2,6);
//        System.out.println();
//        int[] arr3 = new int[3];
//        arrange(arr3,3);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] output = new int[n][n];
//
//        for(int i=0;i<n;i++){
//            output[i] = inputNumber();
//        }
//        for(int j=0;j<n;j++){
//            int sum = sumNumbers(output[j]);
//            System.out.println(sum);
//        }

        // System.out.println(factorial(4));

//        int n =5438;
//int max = 0;
//int i=1;
//        while(n/i>0){
//            //System.out.println((n/i*10));
//            int newno= ((n/(i*10)))*i+n%i;
//            i= i*10;
//            System.out.println(newno);
//        }

        //System.out.println(probability(3,1));
//          int n = 5438;
//
//          int[] three_digit = new int[4];
//          int temp=n;
//          int i=3;
//
//          while (temp>=0 && i>=0){
//              int mode= temp%10;
//              temp = temp/10;
//              three_digit[i] = mode;
//              i--;
//
//          }
//
//           int max = 0;
//           for(int k=0;k<4;k++){
//               int new_no=0;
//               for(int j=0;j<4;j++){
//                   if(k!=j){
//                       new_no = new_no *10 + three_digit[j];
//                   }
//               }
//               if(new_no>max){
//                   max =new_no;
//               }
//           }
//
//           System.out.println(max);

//          String new_no = String.valueOf(n);
//        new_no.charAt(0);

//          System.out.println(Integer.valueOf(new_no.substring(1)));
//          System.out.println(new_no.substring(0,2) + new_no.substring(3));
//        System.out.println(new_no.substring(0,3) + new_no.substring(4));
//        System.out.println(new_no.substring(0,1) + new_no.substring(3,4));


//          for ( int i =1;i<=4;i++){
//              int new_no =
//          }

//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
// System.out.print
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(j>=n-i+2){
//                   ("*");
//                }else {
//                    System.out.print(j);
//                }
//            }
//            for(int j=n;j>=1;j--){
//
//                if(j>=n-i+2){
//                    System.out.print("*");
//                }else{
//                    System.out.print(j);
//                }
//
//            }
//            System.out.println();
//
//        }
//
//        boolean arr[] = new boolean[5];
//        System.out.println(arr[0]);


//        int a=5,b=4;
//        System.out.println(a*=b);//line 1
//        System.out.println(a=(a==b));//line 2
//        System.out.println(a==b);//line 3
//        int i = 0;
//        for (System.out.print("Hi"); i < 1; i++)
//            System.out.print("Ninjas");
//
//        int first=0,second =1;
//        int sum=0;
//
//
//        while(sum<=n){
//          if(sum==n){
//              System.out.println(true);
//             // return true;
//              return;
//          }
//          sum = first+second;
//          first =second;
//          second =sum;
//
//
//        }
//
//        System.out.println(false);


//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        int gap = sc.nextInt();
//
//        for(int i =start;i<=end;i+=gap){
//            int celius =  (int)((int)(i-32)/1.800);
//            System.out.println(i+"\t"+celius);
//        }



//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j =n;
//            while (j>=1){
//                if(i==j){
//                    System.out.print("*");
//                }else {
//                    System.out.print(j);
//                }
//                j--;
//            }
//
//            i++;
//            System.out.println();
//        }

//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        System.out.println(n);
//
//        if(n>=3) {
//            int firstNo, secondNo;
//
//            int diff = 0;
//            String newLine = sc.next();
//            System.out.println(newLine);
//            String[] arr=  newLine.split(" ");
//            firstNo = Integer.valueOf(arr[0]);
//            secondNo = Integer.valueOf(arr[1]);
//            diff = secondNo - firstNo;
//
//
//            int i = 2;
//            while (i <= n) {
//                firstNo = secondNo;
//               // secondNo = sc.nextInt();
//                secondNo = Integer.valueOf(arr[i]);
//
//                if (diff != secondNo - firstNo) {
//                    System.out.println(false);
//                    return;
//                }
//
//                i++;
//
//            }
//            System.out.print(true);
//        }else{
//            System.out.println(false);
//        }
//        6
//        2 6 10 14 18 22

//6
//2 6 10 14 18 22


//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        //6
//      //  2 6 10 14 18 22
//
////        6
////        2 6 10 15 19 23
//
//        if(n>=3) {
//            int firstNo, secondNo;
//            String[] arr=  sc.next().split(" ");
//           // System.out.print(Integer.valueOf(arr[0]));
//            int diff = 0;
//            firstNo = sc.nextInt();
//            secondNo = sc.nextInt();
//            diff = secondNo - firstNo;
//
//
//            int i = 2;
//
//            while (i <= n) {
//                firstNo = secondNo;
//                secondNo = sc.nextInt();
//                if (diff != secondNo - firstNo) {
//                    System.out.println(false);
//                    return;
//                }
//
//                i++;
//
//            }
//            System.out.print(true);
//        }else{
//            System.out.println(true);
//        }





//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int firstNo, secondNo;
//        int diff = 0;
//        firstNo = sc.nextInt();
//        secondNo = sc.nextInt();
//        diff = secondNo - firstNo;
//
//        if(n>=3) {
//
//            int i = 2;
//            while (i <= n) {
//                if(sc.hasNext()) {
//                    firstNo = secondNo;
//                    secondNo = sc.nextInt();
//                    if (diff != secondNo - firstNo) {
//                        System.out.println(false);
//                        return;
//                    }
//                }
//
//                i++;
//
//            }
//            System.out.print(true);
//        }else{
//            System.out.println(true);
//        }
//
//


//        int reverseNo=0;
//        int temp = n;
//
//        while(temp>0){
//            int mode = temp%10;
//            temp= temp/10;
//            reverseNo = reverseNo*10 +mode;
//
//        }
//
//        if(reverseNo == n){
//            System.out.print(true);
//        }else{
//            System.out.print(false);
//        }




//        if(n>=2) {
//            boolean dec = true;
//
//            int firstValue = sc.nextInt();
//            int secondValue = sc.nextInt();
//
//            if(firstValue ==secondValue){
//                System.out.print(false);
//                return;
//            }
//
//            if(secondValue>firstValue){
//                dec = false;
//            }
//
//            int i = 3;
//
//            while (i <= n) {
//                firstValue = secondValue;
//                secondValue =   sc.nextInt();
//                if(firstValue ==secondValue){
//                    System.out.print(false);
//                    return;
//                }
//                if (dec) {
//                     if(secondValue >firstValue){
//                         dec = false;
//                     }
//                }else{
//                    if(secondValue <firstValue){
//                        System.out.print(false);
//                        return;
//                    }
//                }
//
//                i++;
//            }
//            System.out.print(true);
//        }else{
//            System.out.print(false);
//        }



//        System.out.println((int)Math.sqrt(2));
//        System.out.println((int)Math.sqrt(3));

//        if(n>=0){
//            if(n==1 || n==0){
//                System.out.print(1);
//                return;
//            }
//            long temp = n/2;
//
//            while(n>=1){
//                if(temp*temp==n){
//                    System.out.print(temp);
//                    return;
//                } else if (temp*temp<n) {
//                    System.out.print(temp);
//                    return;
//                } else{
//                    if(temp/2 *temp/2 >n){
//                        temp = temp/2;
//                    }else {
//                        temp--;
//                    }
//                    System.out.println(temp);
//
//                }
//
//            }
//        }
//

//        long binaryNo=0;
//        long pow =1;
//        //100000
//        while (n>0){
//            long mode =  n%2;
//            System.out.println(n);
//            n = n/2;
//
//            binaryNo = binaryNo + mode*pow;
//            pow = pow *10;
//
//            System.out.println(binaryNo);
//
//        }
//        if(binaryNo>=0){
//            System.out.print(binaryNo);
//
//        }
//

//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int decNo=0;
//
//        if(n>=0){
//
//            int i=0;
//            while (n>0){
//
//                int mode = n%10;
//                n= n/10;
//                decNo = decNo +mode * (int)(Math.pow(2,i));
//                i++;
//            }
//
//            System.out.print(decNo);
//
//        }

//        if(n>=0){
//
//            int i=0;
//            while (n>0){
//
//                int mode = n%10;
//                n= n/10;
//                decNo = decNo +mode * (int)(Math.pow(2,i));
//                i++;
//            }
//
//            System.out.print(decNo);
//
//        }

//        boolean initialValue = true;
//
//        if(n>0){
//
//            while (n>0){
//                int mode  = n%10;
//                n = n/10;
//                if(initialValue && mode ==0){
//                    continue;
//                }
//                initialValue = false;
//                System.out.print(mode);
//            }
//        }

//        if(n>=1) {
//            int j = 1;
//
//            for (int i = 1; i <= n+1000; i++) {
//
//                if (j == n + 1) {
//                    break;
//                }
//                int number = 3 * i + 2;
//
//                if (!(number % 4 == 0)) {
//                    System.out.print(number + " ");
//                    j++;
//                }
//
//            }
//        }

//
//        int product =1;
//        int sum =0;
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1:
//                for(int i=1;i<=n;i++){
//                      sum = sum+i;
//                }
//                System.out.println(sum);
//                break;
//            case 2:
//                for(int i=1;i<=n;i++){
//                    product = product*i;
//                }
//                System.out.println(product);
//                break;
//            default:
//                System.out.println(-1);
//        }


//
//        Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        if(n==2){
//            System.out.println(n);
//        }
//
//
//        for(int i=2;i<n;i++){
//
//            for(int j=2;j<n;j++){
//
//
//
//                if(i==j){
//                    System.out.println(i);
//                    break;
//                }else {
//                     if(i%j==0){
//                         break;
//                     }
//
//
//
//                }
//
//            }
//        }


//        if(n>0 && n<=2){
//            System.out.println(1);
//
//        }else {
//
//            int first_number = 1;
//            int second_number = 1;
//            int sum = 0;
//
//            for (int i = 1; i <= n - 2; i++) {
//                sum = first_number + second_number;
//
//                first_number = second_number;
//                second_number = sum;
//
//            }
//
//            System.out.println(sum);
//        }

//        int a=10,b=20;
//        System.out.println(a+++--b);//line 1
//        System.out.println(a--+++b);//line 2
//        System.out.println(a++-++b);//line 3
//        System.out.println(a+++++b);//line 4

//        for(int i = 7; i !=0 ; i = i - 1) {
//            System.out.println(i--);
//            if(i<-40){
//                break;
//            }
//        }


//        for(int i = 0; i < 2; i = i + 1) {
//            for(int j = 0; j < 2; j = j + 1) {
//                if (j == 1)
//                    break;
//                System.out.print(j +" ");
//            }
//        }
//
//        int a=10,b=-20;
//
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(-26));
//
//        System.out.println(a^b);
//        System.out.println(a|b);
//
//        Scanner s=new Scanner(System.in);
//
//        int n=s.nextInt();
//        int j =1;
//        int i = 1;
//        int no_start=1;
//        int[] array =new int[n];
//        while (i<=n-1) {
//
//            while (j <= n) {
//                System.out.print(no_start);
//
//                array[j-1] = no_start;
//                no_start = no_start + 2;
//                j++;
//
//            }
//
//            if(i>=1){
//                System.out.println();
//                for(int value =i;value<n;value++){
//               //     System.out.print("#");
//                    System.out.print(array[value]);
//
//                }
//
//                for(int value =0;value<i;value++){
//
//                    System.out.print(array[value]);
//                }
//
//
//
//            }
//
//
//            i++;
//        }

//        int i=1;
//        String number = new String("");
//        int j =1;
//
//        int first_no=1;
//        int second_no=3;
//        while (i<=n){
//
//            if(i>=2){
////               String firstChar =   number.substring(0,1);
////               String remainingStr = number.substring(1,number.length());
////                number = remainingStr+firstChar;
//                j =1;
//                no_start = first_no;
//                int initial_first_no= first_no;
//
//                while (j<=n) {
//
//                    no_start = no_start + 2;
//                    if (no_start >= n * 2) {
//                        System.out.print(initial_first_no);
//                    } else {
//                        System.out.print(no_start);
//                    }
//                    if(j==1){
//                        first_no = no_start;
//                    }
//
//
//                    j++;
//                }
//
//
//
//
//
//            }else{
//                while (j<=n) {
//                    System.out.print(no_start);
//                    if(j==1){
//                        first_no = no_start;
//                    }
//                    no_start = no_start+2;
//                    j++;
//                    //System.out.println("hello");
//                }
//            }
//            i++;
//            System.out.println();
//           // System.out.println( Integer.valueOf(number));
//        }

//        int sum=i;
//
//        while(i<=n){
//
//            int t=1;    //starting number
//
//            int j=1;
//
//            while(j<=i){
//
//                if(t<i){
//
//                    System.out.print(t+"+");
//
//                    t++;
//
//                    j++;
//
//                }
//
//                else{
//
//                    System.out.print(t+"="+sum);
//
//                    j++;
//
//                }
//
//            }
//
//            System.out.println();
//
//            i++;
//
//            sum=sum+i;
//
//        }





//        if(n>0 && n<=50) {
//            int i = 1;
//
//            System.out.println(i + "=" + i);
//            i++;
//
//            String numbers = "1";
//            int sum = 1;
//            while (i <= n) {
//                numbers = numbers + "+" + i;
//                sum = sum + i;
//                System.out.println(numbers + "=" + sum);
//                i++;
//            }
//
//        }
//        while(i<=n){
//
//            int j=1;
//
//            int p=1;
//            while (p<=i-1){
//                System.out.print(" ");
//                p++;
//            }
//            while (j<=n){
//                System.out.print("*");
//                j++;
//            }
//
//
//
//            System.out.println();
//            i++;
//        }
        // Scanner sc  = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int no_of_rows =  (n *2 +1) -2;
//
//        int i=1;
//        System.out.println("*");
//        while (i<=no_of_rows){
//
//            System.out.print("*");
//
//            int j=1;
//            int number =0;
//
//
//            while (j<=i && i<=n){
//
//                    number++;
//
//                    System.out.print(number);
//                j++;
//            }
//
//
//            while (number>1){
//                number--;
//                System.out.print(number);
//            }
//
//            int down_number =0;
//            int j_down =1;
//            while (i>n  && j_down<=no_of_rows-i+1){
//                down_number++;
//
//                System.out.print(down_number);
//
//                j_down++;
//
//            }
//            while (down_number>1){
//                down_number--;
//                System.out.print(down_number);
//
//            }
//            System.out.print('*');
//            System.out.println();
//            i++;
//        }

        //System.out.println("*");
//        while (i<=n){
//
//            int space = 1;
//            while (space<=midPoint-i){
//               System.out.print(" ");
//               space++;
//
//            }
//
//            int down_space=midPoint;
//            while(i>midPoint && down_space<=i-1){
//                System.out.print(" ");
//                down_space++;
//            }
//            int star =1;
//            while(star<=i && i<=midPoint){
//                System.out.print("*");
//                star= star+1;
//            }
//
//            int down_star=1;
//            //System.out.println(n-i);
//           // System.out.println(n-i);
//            while(i>midPoint && down_star<=n-i+1){
//                System.out.print("*");
//                down_star++;
//            }
//
//            int down_star_2=1;
//            //System.out.println(n-i);
//            // System.out.println(n-i);
//            while(i>midPoint && down_star_2<=n-i){
//                System.out.print("*");
//                down_star_2++;
//            }
//
//
//
//            int dec =1;
//            while (dec<=i-1 && i<=midPoint){
//                System.out.print("*");
//                dec= dec+1;
//            }
//
//
//            System.out.println();
//            i++;
//        }


//        while(i<=n){
//            int j=1;
//
//            while(j<=n-i){
//                System.out.print(" ");
//                j++;
//            }
//            int star =1;
//            int inc=i;
//            while(star<=i){
//                System.out.print(inc);
//                star++;
//                inc++;
//            }
//
//            int dec = i-1;
//            int decnum = inc-1;
//            while(dec>=1){
//                decnum--;
//                System.out.print(decnum);
//                dec--;
//            }
//            System.out.println();
//            i++;
//        }

//        while(i<=n){
//            int j=1;
//            while(j<=n-i+1){
//                System.out.print(n-i+1);
//                j++;
//            }
//
//            System.out.println();
//            i++;
//        }


//        while(i<=n){
//            int p=1;
//            int j=1;
//            while(j<=n-i){
//                System.out.print(" ");
//                j++;
//            }
//
//            while(j<=n){
//                System.out.print(p);
//                j++;
//                p++;
//            }
//            System.out.println();
//            i++;
//        }


//        while(i<=n){
//            int j=1;
//            //int p = n;
//            char charValue = (char) ('A' + n - i);
//            while(j<=i){
//                //char charValue = (char) ('A' + n -i +1+j-1);
//                char p = (char)(charValue +j -1);
//                System.out.print(p);
//                j++;
//
//            }
//            System.out.println();
//            i++;
//        }

//        int n = sc.nextInt();
//        int i=1;
//
//        while(i<=n){
//            int j=1;
//
//            while(j<=i){
//                char charValue = (char) ('A' + n -i +1+j-1);
//                System.out.print(charValue);
//                j++;
//
//            }
//            System.out.println();
//            i++;
//        }
        // int n=sc.nextInt();

//            int currentRow=1;
//            while(currentRow<=n){
//                int currColm=1;
//                while(currColm<=n){
//                    System.out.print(n);
//                    currColm++;
//                }
//                System.out.println();
//                currentRow = currentRow +1;
//            }
    }
//
//        Scanner sc  = new Scanner(System.in);
//
//        int n=sc.nextInt();







//        if(n>=0 && n<50 ){
//            int i=1;
//            while(i<=n){
//                int j=1;
//                while(j<=n){
//                    System.out.print(n);
//                    j++;
//                }
//                System.out.println();
//                i++;
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//
//
//        int n = sc.nextInt();
//        int i=1;
//        while(i<=n){
//           int j=n;
//           while(j>0){
//               System.out.print(j);
//               j--;
//           }
//           System.out.println();
//           i++;
//        }
//
//        int n = sc.nextInt();
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        int i=2;
//
//        if(n>=0 && n<=10000){
//            boolean isPrime = true;
//            while(i<n){
//                if(n%i==0) {
//                    System.out.print(i + " ");
//                    isPrime = false;
//                }
//                i++;
//            }
//
//
//
//
//            if(isPrime){
//                System.out.println("No output as "+n+" is prime having factors as 1 and "+n+" only");
//            }
//        }


//
//        int n = sc.nextInt();
//        int i = sc.nextInt();
//        int j = (int)Math.pow(n,i);
//
//        System.out.println(j);



//        if(n>=0 && n<=10000) {
//            boolean isPrime = true;
//            while (i < n) {
//                if (n % i == 0) {
//                    System.out.print(i + " ");
//                    isPrime = false;
//                }
//                i++;
//            }
//
//
////        int n = sc.nextInt();
////        int i=2;
////
////        boolean isPrime = true;
////        while(i<n){
////            if(n%i==0) {
////                if(!(values.containsKey(i) || values.containsKey(n/i))) {
////                    System.out.println(i + " " + n / i);
////                    isPrime = false;
////                    values.put(i, n / i);
////                }
////            }
////            i++;
////        }
//
//            if (isPrime) {
//                System.out.println("No output as " + n + " is prime having factors as 1 and " + n + " only");
//            }
//        }

//        int sum_even=0,sum_odd=0,n;
//        n = sc.nextInt();
//
//        int reminder;
//        while (n>0){
//            reminder = n%10;
//            if(reminder%2==0){
//                sum_even = sum_even+reminder;
//            }else{
//                sum_odd = sum_odd+reminder;
//            }
//            n= n/10;
//        }
//
//                System.out.println(sum_even+" " +sum_odd);
//
//
//




//        int i=1;
//        while (i<=10){
//            System.out.println(n*i);
//            i++;
//
//        }
//        int basic;
//        double  da, hra, allow, pf, totalSalary;
//        basic = sc.nextInt();
//        char ch = sc.nextLine().trim().charAt(0);
//
//
//        hra = (20.0 * basic) / 100;
//        da = (50.0 * basic) / 100;
//        pf = 11.0 * basic / 100;
//
//
//        if (ch == 'A') {
//            allow = 1700;
//        } else if (ch == 'B') {
//            allow = 1500;
//        } else {
//            allow = 1300;
//        }
//        totalSalary = ( basic + hra + da + allow - pf);
//        System.out.println(Math.round(totalSalary));

}

//        int s,e,w;
//        Scanner sc = new Scanner(System.in);
//         s = sc.nextInt();
//         e = sc.nextInt();
//         w =sc.nextInt();


//        int s,e,w;
//        Scanner sc = new Scanner(System.in);
//        s = sc.nextInt();
//        e = sc.nextInt();
//        w =sc.nextInt();
//
//        if((0 <= s &&  <= 90)  && (s <= e <=  900)  && (0 <= w <= 80) ){
//
//            while (s<=e){
//                System.out.println(s + " " +((s - 32)*5)/9);
//                s =s+w;
//            }
//        }else{
//            System.out.println("input values are wrong");
//        }




//        System.out.println("Hello world!");
//        System.out.println(10+10.5f);
//        double d = 2.2f;
//        System.out.println(d);
//        Scanner sc = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//
//
//
//        //System.out.println(i);
//        //String value1 = sc.nextLine();
//
//        char j = sc.nextLine().charAt(0);
//
// System.out.println(j);
//
//        int m1,m2,m3,avg;
//
//        m1 = sc2.nextInt();
//
//        m2 = sc2.nextInt();
//        m3 = sc2.nextInt();
//
//        System.out.println(m1+m2+m3/3);

//        int a=10,b=20;
//        byte b =50;
//        b= (byte) (b*50);
//        int a=50;
//        if(a>10)
//        {
//            System.out.print("Coding");
//        }
//        else(a>20)
//        {
//            System.out.print("Ninjas");
//        }


//        Scanner sc = new Scanner(System.in);
//        char a = sc.nextLine().charAt(0);
//
//        if(a>=97 && a<=122){
//            System.out.println(0);
//
//        }else if(a>=65 && a<=90){
//            System.out.println(1);
//        }else{
//            System.out.println(-1);
//
//        }
//        int i=0;
//        while(i<10)
//        {
//            i=i+1;
//            System.out.print(i);
//            i=i+1;
//        }











//


//  System.out.println(value1);

