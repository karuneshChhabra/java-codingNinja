package fundamentals;

import java.util.*;


public class Sorting {




    public static void printNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }

    }


    public static void selectionSor(int[] arr) {
// This is not selection sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

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


    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }


    // quick sort
    public static void insertionSort(int[] arr) {

// This is not right insertion sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j -1 ]) {
                    int temp =arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                }else{
                    break;
                }

            }


        }
    }


    public static void insertionSort2(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if(temp<arr[j]){
                    arr[j+1] =arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
            System.out.println();


        }
    }

    public static int[] merge(int arr1[], int arr2[]) {

        int[] arr3 = new int[arr1.length+arr2.length];

        int k =0;
        int i=0,j=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k] =arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            arr3[k] =arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k] =arr2[j];
            j++;
            k++;
        }

        return arr3;

    }


    public static void selectionSort(int[] arr) {

        int minIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int minElem = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minElem) {
                    minIndex = j;
                    minElem = arr[j];
                }

            }
            System.out.println(minElem);

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            printNumbers(arr);
            System.out.println();
        }
    }

    public static void pushZerosAtEnd(int[] arr) {
        //Your code goes here
        int k=0;
        for(int i=0;i<arr.length;i++ ) {
            if(arr[i] != 0){
                int temp =arr[i];
                arr[i] =arr[k];
                arr[k] =temp;
                k++;

            }
        }


//        int[] new_arr = new int[arr.length];
//        int k=0;
//
//        for(int i=0;i<arr.length;i++ ){
//
//            if(arr[i] != 0){
//                new_arr[k]=arr[i];
//                k++;
//            }
//        }
//        System.out.println();
//        printNumbers(new_arr);
//        System.out.println();
//        arr = new_arr;
//        printNumbers(arr);
//        System.out.println();
//        for(int i=0;i<arr.length;i++ ){
//
//                int j=0;
//                while(j<arr.length-1-i){
//                    if(arr[j] ==0) {
//                        int temp = arr[j+1];
//                        arr[j+1] =arr[j];
//                        arr[j] =temp;
//                    }
//                    j++;
//                }
//
//        }
    }


    public static int secondLargestElement(int[] arr) {
        //Your code goes here

        int largest =arr[0],secondLargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){

            if(secondLargest<arr[i]){
                if(largest<arr[i]){
                    secondLargest = largest;
                    largest =arr[i];
                }else if(largest>arr[i]){
                    secondLargest =arr[i];
                }

            }
        }
        return secondLargest;
    }


    public static int arrayRotateCheck(int[] arr){
        //Your code goes here

        if(arr.length==0){
            return 0;
        }

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }




        return 0;
    }
    // Rotation problem better solution

    public static void rotate(int[] arr, int d) {
        //Your code goes here

        if(arr.length>0){
            return;
        }
        d= d%arr.length;


        int[] new_array = new int[d];
        int j=0;
        int k=0;

        while (j<d){
            new_array[k]=arr[j];
            k++;
            j++;
        }
        while (j<arr.length){
            arr[j-d] = arr[j];
            j++;
        }
        j= arr.length-d;
        k=0;
        while(j< arr.length){
            arr[j] = new_array[k];
            j++;
            k++;
        }








//        System.out.println();
//        printNumbers(arr);
//        System.out.println();
    }


    public static void sort012(int[] arr) {
        //Your code goes here
        int startIndex =0;
        int endIndex= arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                // arr[startIndex] =0;
                startIndex++;
            }else if(arr[i]==2){
                //   arr[endIndex] =2;
                endIndex--;
            }
        }
        printNumbers(arr);
        System.out.println("itr");

        for(int i=0;i<arr.length;i++){
            if(i<startIndex){
                arr[i] =0;
            } else if (i >endIndex) {
                arr[i]=2;
            }else {
                arr[i] =1;
            }
        }

//        while (startIndex<endIndex){
//            arr[startIndex]=1;
//            startIndex++;
//        }

    }

    public static int arrayEquilibriumIndex(int[] arr){

        //Your code goes here
        if(arr.length==0){
            return -1;
        }

        int leftsum=0,rightSum=0;

        for(int i=0;i<arr.length;i++){
            rightSum = rightSum+arr[i];
        }



        for(int i=0;i<arr.length;i++){
            rightSum=rightSum-arr[i];
            if(leftsum==rightSum){
                return i;
            }else{
                leftsum=leftsum+arr[i];
            }

        }
        return -1;


    }


    public static void sort012_test(int[] arr) {
        //Your code goes here

        int nextZero =0;
        int nextTwo = arr.length -1;

        for(int i=0;i<arr.length && i<=nextTwo;){
            if(arr[i]==2 && i<=nextTwo){
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] =temp;
                nextTwo--;
            }else if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] =temp;
                nextZero++;
                i++;

            } else{
                i++;
            }


        }




//        }

    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        //Your code goes here

        int m = arr1.length;
        int n =arr2.length;
        int l = output.length;
        int carry=0;
        int i=0,j=0;

        for (;i<arr1.length && j<arr2.length;i++,j++){
            int sum = arr1[m-i-1]+arr2[n-j-1] +carry;
            carry =sum/10;
            output[l-i-1] = sum%10;
            System.out.println();
            printNumbers(output);
        }
        if(m>n){
            for (;i<arr1.length;i++) {
                int sum = arr1[m - i - 1]  + carry;
                carry = sum / 10;
                output[l - i - 1] = sum % 10;
                System.out.println();
                printNumbers(output);
            }
        }else{
            for (;j<arr2.length;j++) {
                int sum = arr2[n-j-1]  + carry;
                carry = sum / 10;
                output[l - j - 1] = sum % 10;
                System.out.println();
                printNumbers(output);
            }
        }
        if(carry>0){
            output[0] = carry;
        }
        printNumbers(output);
    }

    public static void rowWiseSum(int[][] mat) {
        //Your code goes here
        for(int i=0;i<mat.length;i++){
            int sum =0;
            for(int j=0;j<mat[0].length;j++){
                sum = sum +mat[i][j];
            }
            System.out.print(sum+" ");
        }
    }

    public static void findLargest(int mat[][]){
        //Your code goes here

        int columSum =0;
        int index =0 ;

        int rowSum = 0;

        int largest =Integer.MIN_VALUE;

        boolean rowIndex = true;
        for(int i=0;i<mat.length;i++){
            rowSum =0;
            for(int j =0;j<mat[0].length;j++){
                rowSum= rowSum+ mat[i][j];
            }
            if(rowSum>largest){
                largest = rowSum;
                index = i;

            }
        }

        for(int j=0;j<mat[0].length;j++){
            columSum=0;
            for(int i =0;i<mat.length;i++){
                columSum= columSum+ mat[i][j];
            }
            if(columSum > largest){
                largest = columSum;
                index = j;
                rowIndex=false;
            }

        }

        if(rowIndex){
            System.out.println("row "+ index+ " "+largest);
        }else{
            System.out.println("column "+ index+ " "+largest);
        }


    }

    public static void totalSum(int[][] mat) {
        //Your code goes here
        int sum =0;
        int m = mat.length;
        int n =mat[0].length;
        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat[0].length;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1 || i==j || i==n-j-1 || j==n-i-1){
                    // if( i==j || i==n-j-1 || j==n-i-1){

                    sum = sum+mat[i][j];
                }

            }
        }
        System.out.println(sum);
    }

    public static void wavePrint(int mat[][]){
        //Your code goes here

        if(mat.length>0) {
            int m =mat.length;
            int n =mat[0].length;
            for (int i = 0;i<n;i++){
                int j=0;
                for(;j<mat.length;j++){
                    System.out.print(mat[j][i] +" ");
                }
                i++;
                for(j=m-1;j>=0;j--){

                    System.out.print(mat[j][i] +" ");
                }

            }

        }
    }



    public static void spiralPrint(int matrix[][]) {
        //Your code goes here
        //
//        if(matrix.length>0) {
//            int rs = 0, re = matrix.length, cs = 0;
//            int ce =matrix[0].length;
//
//            while(re>rs && ce>cs) {
//                // for row start to end
//                for (int j = cs; j < ce; j++) {
//                    System.out.print(matrix[rs][j] + " ");
//                }
//                rs++;
//
//
//                for (int j = rs; j < re; j++) {
//                    System.out.print(matrix[j][ce - 1] + " ");
//                }
//                ce--;
//
//                for (int j = ce - 1; j >= cs; j--) {
//                    System.out.print(matrix[re - 1][j] + " ");
//                }
//                re--;
//
//
//                for (int j = re - 1; j >= rs; j--) {
//                    System.out.print(matrix[j][cs] + " ");
//                }
//                cs++;
//
//            }
//
//
//        }



        if (matrix.length > 0) {
            int rs = 0, re = matrix.length, cs = 0;
            int ce = matrix[0].length;

            while (re > rs && ce > cs) {
                // for row start to end
                for (int j = cs; j < ce; j++) {
                    System.out.print("first");
                    System.out.print(matrix[rs][j] + " ");
                }
                rs++;

                if (re > rs && ce > cs) {
                    for (int j = rs; j < re; j++) {
                        System.out.print("second");
                        System.out.print(matrix[j][ce - 1] + " ");
                    }
                    ce--;
                }

                if (re > rs && ce > cs) {
                    for (int j = ce - 1; j >= cs; j--) {
                        System.out.print("third");
                        System.out.print(matrix[re - 1][j] + " ");
                    }
                    re--;
                }
                if (re > rs && ce > cs) {
                    for (int j = re - 1; j >= rs; j--) {
                        System.out.print("forth");
                        System.out.print(matrix[j][cs] + " ");
                    }
                    cs++;
                }

            }

        }
    }


    public static boolean isPalindrome(String str) {

        int l = str.length();

        for (int i = 0, j = l - 1; i < l && j  >= i;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        //Your code goes here
        return true;
    }

    public static int countWords(String str) {
        //Your code goes here


        String sub[]= str.split(" ");


        return sub.length;

    }

    public static void subStrings(String str){
        // char[] array = str.split("")
        for(int i=0;i<str.length();i++){

        }
    }

    public static void printSubstrings(String str) {
        //Your code goes here

        if(str.length()==0){
            return;
        }

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }
        }


    }


    public static void printSubstrings2(String str) {
        //Your code goes here

        if(str.length()==0){
            return;
        }
        int k=1;

        while (k<= str.length()) {
            for (int i = 0,j=k; i < str.length() && j<=str.length(); i++,j++) {
                System.out.println(str.substring(i, j ));
            }

            k++;
        }


    }


    public static String reverseWordWise(String input) {
        // Write your code here
        StringBuffer newStr = new StringBuffer();
        if(input.length()==0){
            return newStr.toString() ;
        }
        String arr[] = input.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            StringBuffer singleString = new StringBuffer(arr[i]);
            newStr.append(singleString + " ");
        }

        return  newStr.toString();


    }

    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here

        String newStr ="";

        if(str.length()==0){
            return newStr;
        }

        char[] arr = str.toCharArray();
        char value = Character.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(value!=arr[i]){
                newStr=newStr + arr[i];
            }
            value=arr[i];

        }
        return newStr;

    }
    public static String reverseEachWord(String str){

        StringBuffer newStr = new StringBuffer();

        if(str.length()==0){
            return newStr.toString() ;
        }
        String arr[] = str.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            StringBuffer singleString = new StringBuffer(arr[i]);
            singleString.reverse();
            newStr.append(singleString + " ");
        }
        return newStr.toString();

    }


    public static String removeAllOccurrencesOfChar(String str, char ch) {

        String newStr ="";

        if(str.length()==0){
            return newStr;
        }

        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(ch!=arr[i]){
                newStr=newStr + arr[i];
            }

        }
        return newStr;
        // Your code goes here
    }

    public static char highestOccuringChar(String str) {
        //Your code goes here

        char value =Character.MIN_VALUE;

        if(str.length()==0){
            return 0;
        }
        if(str.length()==1){
            return str.toCharArray()[0];
        }
        char[] arr = str.toCharArray();
        int largestCount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int count =0;
            if(arr[i] !='0'){
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        count++;
                        arr[j] = '0';
                    }
                }
                if (largestCount < count) {
                    largestCount = count;
                    value = arr[i];
                }
            }

        }

        return value;

    }


    // working solution --> time complexity is more
    public static boolean isPermutation2(String str1, String str2) {
        //Your code goes here

        //  if(str1.length() !=str2.length()){
        //     return false;
        // }
        // char[] strArr1 = str1.toCharArray();
        // char[] strArr2 = str2.toCharArray();
        // for(int i=0;i<strArr1.length;i++){
        //     char matchChar= strArr1[i];
        //     boolean matched = false;

        //     for(int j=0;j<strArr2.length;j++){
        //         if(matchChar == strArr2[j]){
        //             matched =true;
        //             strArr2[j]='0';
        //             break;
        //         }
        //     }
        //     if(!matched){
        //         return false;
        //     }
        // }

        // char[] strArr2 = str2.toCharArray();
        // for (int i = 0; i < str1.length(); i++) {
        //     char matchChar = str1.charAt(i);
        //     boolean matched = false;
        //     for (int j = 0; j < strArr2.length; j++) {
        //         if (matchChar == strArr2[j]) {
        //             matched = true;
        //             strArr2[j] = Character.MIN_VALUE;
        //             break;
        //         }
        //     }
        //     if (!matched) {
        //         return false;
        //     }
        // }

        if(str1.length() !=str2.length()){
            return false;
        }

        int[] freq_array = new int[256];

        for(int i=0;i<str1.length();i++){

            freq_array[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            freq_array[str2.charAt(i)]--;
        }

        for(int i=0;i<freq_array.length;i++){

            if(freq_array[i] !=0) {
                return false;
            }
        }


        return true;
    }

    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here

        int m = arr1.length;
        int n = arr2.length;



        Map<Integer,Integer> map1 = new HashMap<>();


        for(int i=0;i<m;i++){
            if(map1.containsKey(arr1[i])) {
                int value = map1.get(arr1[i]);
                map1.put(arr1[i],++value );
            }else{
                map1.put(arr1[i],1);
            }
        }

        int k=0;
        for(int j=0;j<n;j++){
            if(map1.containsKey(arr2[j]) && map1.get(arr2[j])>0) {
                System.out.print(arr2[j] +" ");

                k++;
                int value = map1.get(arr2[j]);
                map1.put(arr2[j],--value);
            }
        }

    }


    public static int findUnique(int[] arr) {
        //Your code goes here

        if(arr.length==0){
            return Integer.MIN_VALUE;
        }

        int m = arr.length;

        HashMap<Integer,Integer> map1 = new HashMap();

        for(int i=0;i<m;i++){
            if(map1.containsKey(arr[i])) {
                int value = map1.get(arr[i]);
                map1.put(arr[i],++value );
            }else{
                map1.put(arr[i],1);
            }
        }

        int uniqueValue = Integer.MIN_VALUE;
        for(int key:map1.keySet()){
            if(map1.get(key)==1){
                return key;
            }
        }
        return uniqueValue;
    }

    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here

        if(str1.length() !=str2.length()){
            return false;
        }

        int[] freq_array = new int[256];

        for(int i=0;i<str1.length();i++){

            freq_array[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            freq_array[str2.charAt(i)]--;
        }

        for(int i=0;i<freq_array.length;i++){

            if(freq_array[i] !=0) {
//                System.out.println(i);
//                System.out.println((char)(i));
//                System.out.println(freq_array[i]);
                return false;
            }
        }

//
//
//       // char[] strArr1 = str1.toCharArray();
//        char[] strArr2 = str2.toCharArray();
//        for(int i=0;i<str1.length();i++){
//            char matchChar= str1.charAt(i);
//            boolean matched = false;
//            for(int j=0;j<strArr2.length;j++){
//                if(matchChar == strArr2[j]){
//                    matched = true;
//
//                    strArr2[j]=Character.MIN_VALUE;
//                    break;
//                }
//
//            }
//            if(!matched){
//                return false;
//            }
//        }
//

        return true;
    }

    public static String getCompressedString(String str) {
        // Write your code here.
        if(str.length() ==0){
            return "";
        }
        String new_string="";
        char[] strArr1 = str.toCharArray();

        char previousValue=0;
        int count = 1;
        for(int i=0;i<strArr1.length;i++){
            if(previousValue == strArr1[i]){
                count++;
            }else{
                if(count!=1) {
                    new_string = new_string + count;
                }
                count=1;
            }
            if(count == 1){
                new_string = new_string +strArr1[i];
            }
            if(i==strArr1.length-1 && count !=1){
                new_string = new_string + count;
            }


            previousValue =strArr1[i];
        }

        return new_string;

    }

    //    {1,6},{3,4},{3,4},{2,5},{5,2} ,{4,3},{2,5},{3,4}
//        {6,1}
    //1, 3, 6, 2, 5, 4, 3, 2, 4
// 1,2, 2, 3, 3, 4, 4, 5, 6
    public static int pairSum2(int[] arr, int num) {
        //Your code goes here
        Arrays.sort(arr);
//
//
//
        if(arr.length==0){
            return 0;
        }

        int count=0;
        int i=0,j=arr.length-1;


        while(j>i){
            System.out.println("i"+arr[i]);
            System.out.println("j"+arr[j]);
            if(arr[i]+arr[j]==num){
                count++;
                j--;
            }else if((arr[i]+arr[j])>num){
                j--;
            }else {
                i++;
            }

//                System.out.println(map1.get(num - arr[i]));

        }



//        HashMap<Integer,Integer> map1 = new HashMap<>();
//
//        for(int i=0;i<arr.length;i++){
//                if (map1.containsKey(arr[i])) {
//                    int value = map1.get(arr[i]);
//                    map1.put(arr[i], ++value);
//                } else {
//                    map1.put(arr[i], 1);
//                }
//        }
//
//        for(int pair:map1.keySet()){
//            System.out.println(pair+":"+map1.get(pair));
//        }
//
//
//        for(int i=0;i<arr.length;i++) {
//            if (map1.containsKey(arr[i]) && map1.containsKey(num- arr[i]) && ( arr[i] ==num-arr[i] && map1.get(arr[i])>1 ) ) {
//                System.out.println(arr[i]);
//                System.out.println(map1.get(num - arr[i]));
//                count = count + map1.get(num - arr[i]) * map1.get(arr[i]);
//                map1.put(arr[i], 0);
//            }
//        }

//        for(int pair:map1.keySet()){
//            System.out.println(pair+":"+map1.get(pair));
//        }


        return count;


    }


    //1 2 3 4 5 6 7  -->12
    // 1    4     7  --> 1,4,7
    // 2    4    6   --> 2,4,6
    // 3    4    5  -- > 3,4,5
    //
    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        Arrays.sort(arr);





        int tripletcount=0;


        for(int i=0;i< arr.length;i++){
            int s = num - arr[i];

            int j =i+1,k=arr.length-1;
            int count =0;
            while(j<k){
                if(arr[j]+arr[k]>s){
                    k--;
                }else if(arr[j]+arr[k]<s){
                    j++;
                }else{
                    //  int startingIndex= j;
                    //  int endIndex = k;

                    if(arr[j]==arr[k] && arr[j]+arr[k]==s ){
                        int noOfElements = k-j+1;
                        count +=(noOfElements *(noOfElements-1)/2.0);
                        System.out.println("arr[i]"+arr[i]+"arr[i]"+arr[j] +"arr[k]"+arr[k]+"count"+count);

                        break;
                    }
                    int tempStartingIndex = j + 1;
                    int tempEndIndex = k -1;

                    while (tempStartingIndex<=tempEndIndex && arr[tempStartingIndex] ==arr[j]){
                        tempStartingIndex++;
                    }
//                     0  1  2  3  4  5  6  7  8  9  10
                    //6 1 6 5 3 2 5 0 5 6 0
                    //  [0, 0, 1, 2, 3, 5, 5, 5, 6, 6, 6]
                    //{0,0,5},{0,0,5},{0,0,5},{0,2,3};
                    while (tempStartingIndex<=tempEndIndex && arr[tempEndIndex] ==arr[k]){
                        tempEndIndex--;
                    }

                    int noOfElementsAtStaring  = tempStartingIndex -j;

                    int noOfElementsAtEnd = k -tempEndIndex;

                    count += (noOfElementsAtEnd * noOfElementsAtStaring);

                    System.out.println("arr[i]"+arr[i]+"arr[i]"+arr[j] +"arr[k]"+arr[k]+"count"+count);

                    j = tempStartingIndex;
                    k= tempEndIndex;

                }
            }
            System.out.println("pr count"+count);
            tripletcount+=count;
        }


        return tripletcount;


//        int n = arr.length;
//
//        int numTriplets = 0;
//
//        for (int i=0; i<n; i++) {
//            int pairSum = num - arr[i];
//            int numPairs = 0;
//
//            int start = i + 1;
//            int stop = n - 1;
//
//            while (start < stop) {
//                if (arr[start] + arr[stop] < pairSum) {
//                    start++;
//                } else if (arr[start] + arr[stop] > pairSum) {
//                    stop--;
//                } else {
//                    if (arr[start] == arr[stop]) {
//                        int totalCount = (stop - start) + 1;
//                        numPairs += (totalCount * (totalCount - 1) / 2);
//                        System.out.println("arr[i]"+arr[i]+"arr[i]"+arr[start] +"arr[k]"+arr[stop]+"count"+numPairs);
////
//                        break;
//                    }
//
//                    int tempI = start + 1;
//                    int tempJ = stop - 1;
//
//                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
//                        tempI++;
//                    }
//
//                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
//                        tempJ--;
//                    }
//
//                    int totalElementFromStart = (tempI - start);
//                    int totalElementFromEnd = stop - tempJ;
//
//                    numPairs += (totalElementFromStart * totalElementFromEnd);
//
//                    System.out.println("arr[i]"+arr[i]+"arr[i]"+arr[start] +"arr[k]"+arr[stop]+"count"+numPairs);
////
//                    start = tempI;
//                    stop = tempJ;
//                }
//            }
//            numTriplets += numPairs;
//        }
//        return numTriplets;
//

    }

    // 1,2, 2, 3, 3, 4, 4, 5, 6 -- 7
    //{1,6},{2,5},{2,5}
    //0, 7, 2, 5, 9, -8, 1, 9,3, 2, 6--> 12
    //


    public  static  int pairSum(int[] arr,int num ){

        Arrays.sort(arr);
        int count =0;

        int startIndex=0;
        int endIndex= arr.length-1;

        while(endIndex>startIndex){
            if(arr[endIndex]+arr[startIndex]>num){
                endIndex--;

            } else if (arr[endIndex]+arr[startIndex]<num) {
                startIndex++;

            }else{
                int startingElement = arr[startIndex];
                int endElement = arr[endIndex];
                if(startingElement==endElement){
                    int totalElements = (endIndex - startIndex) +1;
                    count += (totalElements *(totalElements -1)/2);
                    return count;
                }

                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                while(tempEndIndex>=tempStartIndex && arr[tempStartIndex] == startingElement){
                    tempStartIndex++;
                }
                while(tempEndIndex>=tempStartIndex && arr[tempEndIndex] == endElement){
                    tempEndIndex--;
                }

                int totalElementsfromEnd = tempEndIndex - endIndex;
                int totalElementsFromStart = startIndex - tempStartIndex;
                //  System.out.println("arr[tempStartIndex]:"+arr[tempStartIndex] +"arr[tempEndIndex]:"+arr[tempEndIndex]);
                count += (totalElementsfromEnd * totalElementsFromStart);

                startIndex =tempStartIndex;
                endIndex =tempEndIndex;
                // System.out.println("count:"+count);

            }
        }


        return count;

    }


    public static int findDuplicate(int[] arr) {
        //Your code goes here
        HashMap<Integer,Integer> map1 = new HashMap<>();



        for(int i=0;i<arr.length;i++){
            if (map1.containsKey(arr[i])) {
                int value = map1.get(arr[i]);

                map1.put(arr[i], ++value);
                return arr[i];
            } else {
                map1.put(arr[i], 1);
            }

//                for(int key:map1.keySet()){
//                    if(map1.get(key)>1){
//                        return key;
//                    }
//                }


        }
        return Integer.MIN_VALUE;
    }

    public static int [] change(int input[]){
        input = new int[5];
        input[3] = 15;
        return input;
    }

    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */


        int largest = input[0];
        int largestIndex = 0;

        for (int i = 1; i < input.length; i++) {
            if (largest < input[i]) {
                largest = input[i];
                largestIndex = i;
            }
        }
        System.out.println(largest);


//        int largest = input[0];
//        int largestIndex = 0;

//        for (int i = 1; i < input.length; i++) {
//            if (largest < input[i]) {
//                largest = input[i];
//                largestIndex = i;
//            }
//        }
        //System.out.println(largest);

        //int smallest = input[input.length - 1];
        int secondlargest = input[input.length - 1];
        // System.out.println(smallest);
        for (int i = input.length - 2; i >= largestIndex; i--) {
            System.out.println("i"+input[i]);
            //  System.out.println("j"+input[i-1]);
            if (input[i] <= input[i+1] && input[i]<=largest) {
                System.out.print(input[i+1] + " ");
            }
            secondlargest = input[i];

        }

    }




    public static void leaders2(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

        int largest =input[0];
        int largestIndex=0;


        for(int i=1;i<input.length;i++){
            if(largest<input[i]){
                largest = input[i];
                largestIndex =i;
            }
        }
        //System.out.println(largest);


        int smallest = input[input.length -1];
        //System.out.println(smallest);
        for(int i=input.length-1;i>=largestIndex;i--){
            //  System.out.println("i"+input[i]);
            //   System.out.println("j"+input[i-1]);
            if(input[i] >= smallest) {
                System.out.print(input[i]+" ");
            }
        }





    }

    public static String minLengthWord(String input){

        String value ="";

        String[] values = input.split(" ");
        int smallestString=Integer.MAX_VALUE;

        for(String v:values){
            if(v.length()<smallestString){
                smallestString=v.length();
                value =v;
            }

        }
        return value;
        // Write your code here

    }


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
        for(int i=0;i<value;i++){

            for(int j=0;j<value;j++){

                while(i>0){
                    num--;
                }



                System.out.print(num);

            }
            System.out.println();
        }

    }



    public static  long maximumSumPath(int arr1[], int arr2[]) {


        long count=0;
        long m =arr1.length ,n = arr2.length;



        int i=0,j=0;

        boolean ValueFromSecond=true;

        while (i<m && j<n){

            //     System.out.println("i"+arr1[i]);
            //     System.out.println("j"+arr2[j]);


//            1 5 10 15 20 25
//
//            2 4 5 9 15

            //   System.out.println("count"+count);

//            if(ValueFromSecond){
//                count+=arr2[j];
//
//            }else{
//                count+=arr1[i];
//
//            }

            if(arr1[i]>arr2[j]){

                if(ValueFromSecond){
                    count+=arr2[j];
                }
                j++;
            }else if(arr2[j]>arr1[i]){
                if(!ValueFromSecond){
                    count+=arr1[i];

                }
                i++;
            }else{
                ValueFromSecond = !ValueFromSecond;
                if(!ValueFromSecond){
                    count+=arr1[i];
                }else{
                    count+=arr2[j];
                }
                i++;
                j++;
            }
            // System.out.println("count finally"+count);



        }


        while (i<m){
            count +=arr1[i];
            i++;
        }
        while (j<n){
            count +=arr2[j];
            j++;

        }
        return count;

//        while(i<arr1.length){
//            arr3[k] =arr1[i];
//            i++;
//            k++;
//        }
//        while(j<arr2.length){
//            arr3[k] =arr2[j];
//            j++;
//            k++;
//        }
//
//        return arr3;

    }






    public static void main(String[] args) {

        //String a="pqrs hellooooooohiihiiiiiiiiiiiiiiiiiiiiiiiii hiiiih";
        print(4);
        print(3);

//
//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444



//        int arr[] ={3, 12, 34, 2, 0, -1};
//        leaders(arr);
//
//        int arr2[] ={13, 17, 5, 4, 6};
//        leaders(arr2);



//        int[] arr1 ={1, 5, 10, 15 ,20, 25};
//        int[] arr2 = {2, 4, 5, 9, 15};

//System.out.println(maximumSumPath(arr1,arr2));

        int[] arr3 ={2};
        int[] arr4 = {1};

        System.out.println(maximumSumPath(arr3,arr4));
//    String s ="abc de ghihjk a uvw h j";
//
//        System.out.println(minLengthWord(s));
//        int arr[] = new int[15];
//        arr=change(arr);
//        System.out.println(arr[7]);

//        int arr[] = new int[5];
//        int arr2[] = new int['a'];
//        int bt = 10;
//        int arr3[] = new int[bt];
//        System.out.print(arr.length);
//        System.out.print(" "+arr2.length+" ");
//        System.out.print(arr3.length);


//        String str1 = new String ("I love coding");
//        String str2 = "I love coding";
//        boolean check=(str1=="I love coding");
//        System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check);

//        String a="aaabbcddeeeee";
//
//        //a3b2c2dsa
//        String b="malayalam";
//        String c= new String("malayalam");

        //  int[] arr1 ={1, 3, 6, 2, 5, 4, 3, 2, 4};
        int[] arr12 ={0, 7, 2, 5, 9, -8, 1, 9,3, 2, 6};
        //Arrays.sort(arr1);
        // System.out.println("count:"+  findDuplicate(arr1));
        System.out.println("count it:"+  pairSum(arr12,12));

//        int[] arr1= {2, -5, 8, -6,0, 5, 10, 11, -3};
//        //System.out.println(tripletSum(arr1,10));
//
//        int[] arr4= {6, 1, 6, 5, 3, 2 };
        //System.out.println(tripletSum(arr4,6));



        //    int[] arr5= { 6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
        //System.out.println(tripletSum(arr5,5));

        //6 1 6 5 3 2 5 0 5 6 0
        //  int[] arr2= {  1, 2, 3, 4, 5, 6, 7};
        //  System.out.println(tripletSum(arr2,12));

        //  System.out.println(tripletSum(arr2,19));

        //   int[] arr3= {  3, 3, 3, 3};
        // {3,3,3},{3,3,3},{3,3,3}
        //   System.out.println(tripletSum(arr3,9));

        // System.out.println(tripletSum(arr2,19));
        //  int[] arr2 ={2, 8, 10, 5, -2, 5};
        //Arrays.sort(arr2);


        //   int[] arr3 ={3, 3, 3, 3, 3 };

//        System.out.println(  pairSum(arr2,10));
//        System.out.println(  pairSum(arr3,6));
//
//        int[] arr1 = {3 ,2, 6, 8, 5, 4, 3,8,9,10};
//        int[] arr2 = {4, 2, 3, 4, 2,3, 10, 7};
//
//        int[] arr = {1, -1, 4};
//        int[] arr56={1, 4, 8, 3, 2};
//
//System.out.println(arrayEquilibriumIndex(arr56));
//

        // Arrays.stream(arr2).sorted();
        // insertionSort(arr2);
//        System.out.println(findUnique(arr2));
//        //printNumbers(arr2);
//        System.out.println();
//        int[] arr3 = {10,10};
//        int[] arr4 = {10};
//
//
//        int[] arr5 = {2,5,5};
//        int[] arr6 = {2,5,5};

        //  reverseWordWise(a);
        // System.out.print(getCompressedString(a));
        // System.out.print(isPermutation("sinrtge","stringh"));

//        intersection(arr1,arr2);
//        intersection(arr3,arr4);
//System.out.println();
//        intersection(arr5,arr6);

        //System.out.print(reverseEachWord(a));
//        for (int i=0;i<a.length();i++){
//            System.out.print(a.charAt(i)+" ");
//        }

//        String str1="abc";
//        String str2="";
//        System.out.println(str1.contains(str2));
//
//        System.out.println( a==b);
//        System.out.println( a==c);
//        System.out.println( a);
//        System.out.println( b);
//        b= b+"hello";
//        System.out.println( a);
//        System.out.println( b);
        // System.out.print( isPalindrome(a));

//        String a="coding";
//        for(int i=2;i<5;i++)
//        {
//            System.out.print(a.substring(i-2,i+1));
//        }
//        //cododidin
        //int a=10,b=-20;
        // System.out.println(a^b);

//        int[] arr1 ={9, 7, 6, 1};
//        int[] arr2 ={4, 5, 9};
//        int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
//        sumOfTwoArrays(arr1,arr2,output);
//        System.out.println(output.length);
//        printNumbers(output);



//        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
//        totalSum(arr);
//
//
        //  int[][] arr6 ={{1,2,3,4},{3,4,5,6},{5,6,7,8},{7,8,9,10}};
        // spiralPrint(arr6);
//
//        int[][] arr5 ={{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10 ,11 ,12}
//        };
//        spiralPrint(arr5);
//
//        int[][] arr7 ={{ 1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11 ,12 ,13, 14, 15},
//                { 16, 17, 18 ,19, 20},
//                {21, 22, 23, 24 ,25}};
//System.out.println();
//        spiralPrint(arr7);
//
//        int[][] arr8 ={{1},{2}};
//        System.out.println();
//        spiralPrint(arr8);
//
//        int[][] arr9 ={{1,2}};
//        System.out.println();
//        spiralPrint(arr9);
//
//        int[][] arr3 ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
//        totalSum(arr3);
//
//        int[][] arr2 ={{2,2},{1,1}};
//        totalSum(arr2);
//
//
//        int[][] arr4 ={{1, 2, 3, 4 ,5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{ 16 ,17, 18, 19, 20},{21, 22, 23 ,24, 25}};
//        totalSum(arr4);
//
//        int [][] arr ={{1,  2,  3,  4}, {5,  6,  7,  8}, {9, 10, 11, 12}};
//        wavePrint(arr);






//        int[][] arr3 ={{1,2},{90,100},{3,40},{-10,200}};
//        findLargest(arr3);
        //int[] arr ={1,2,3,4,5,6,7,9,12,4,5,6,23,5,2,4,9,90};
//        int[] arr ={10, 20, 30, 1};
//        int[] arr ={0, 1, 2, 0, 2, 0, 1};
//        int[] arr2 ={0, 1, 2, 1, 1, 2, 0};
//        int[] arr3 ={2 ,1 ,0, 1, 2, 0 };
//        int[] arr4 ={2, 2, 1, 1, 2 ,1, 0, 0, 1, 2, 2 };
//        int[] arr5 ={2, 2, 1, 2, 2 ,0, 0, 0, 0, 2, 2 };
//
//        int[] arr6 ={0};
//        int[] arr7 ={2, 1, 2, 2 };
//        int[] arr8 ={0,1,1,0,1 };

        //  rotate(arr,4);
        //
//        sort012_test(arr);
//            printNumbers(arr);
//            System.out.println();
//        sort012_test(arr2);
//            printNumbers(arr2);
//        System.out.println();
//        sort012_test(arr3);
//        printNumbers(arr3);
//        System.out.println();
//        sort012_test(arr4);
//        printNumbers(arr4);
//        System.out.println();
//        sort012_test(arr5);
//        printNumbers(arr5);
//        System.out.println();
//        sort012_test(arr6);
//        printNumbers(arr6);
//        System.out.println();
//        sort012_test(arr7);
//        printNumbers(arr7);
//        System.out.println();
//        sort012_test(arr8);
//        printNumbers(arr8);
////        int[] arr ={9,0,0, 8,0, 2,0,0,0,0,4,4,5,0,8};
//        //int[] arr ={9,0,0, 8,2};
//
//        pushZerosAtEnd(arr);
//        printNumbers(arr);
//        int[] arr = {1, 3, 4, 7, 11};
//        int[] arr2 = {2, 4, 6, 13};
        // selectionSort(arr);
//        sumNumbers(arr);
//        System.out.println();
//        printNumbers(arr);
//        System.out.println();
//        printNumbers(arr2);
//        System.out.println();
//        int[] arr3 = merge(arr,arr2);
//        printNumbers(arr3);
//
//        int[] arr4 = {10, 100, 500};
//        int[] arr5 = {2, 4, 6, 13};
    }
}

