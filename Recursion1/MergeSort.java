
class  MergeSort{


    public static void mergeTwoArray(int[] input,int si,int mid, int ei){
        int[] arr1 = new int[mid-si+1];
        int[] arr2 = new int[ei-mid];

        for(int i=0;i<arr1.length;i++){
            arr1[i] = input[si+i];
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j] = input[mid+1+j];
        }


        int i=0,j=0;
        int k=si;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                input[k] = arr2[j];
                j++;
            } else if (arr1[i]<=arr2[j]) {
                input[k] = arr1[i];
                i++;
            }
            k++;
        }

        while (i<arr1.length){
            input[k] = arr1[i];
            i++;
            k++;
        }
        while ( j<arr2.length){
            input[k] = arr2[j];
            j++;
            k++;
        }


    }

    public static void mergeSort(int[] input,int si,int ei){
        // Write your code here


        if(si==ei){
            return;
        }

        int midElem = (si + ei) / 2;


         mergeSort(input,si,midElem);
         mergeSort(input,midElem+1,ei);
        mergeTwoArray(input,si,midElem,ei);


    }


    public static void print(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] input){

         mergeSort(input,0,input.length-1);


    }

    public static void main(String[] args) {

        int[] input = new int[]{2, 6, 8, 5, 4, 3};

        mergeSort(input);
        print(input);

    }
}