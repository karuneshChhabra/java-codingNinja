

class MergeSort2{

    public static void print(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeTwoArray(int[] arr,int l, int r,int mid){

        int[] arr1 = new int[mid-l+1];
        int[] arr2 = new int[r-mid];




        int k=l;
        for(int i=0;i<mid-l+1;i++){
            arr1[i] = arr[k+i];
        }

        k=mid+1;
        for(int i=0;i<r-mid;i++){
            arr2[i] = arr[k+i];
        }


        int i=0,j=0;
        k=l;
        while (i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                 arr[k] = arr1[i];
                i++;
            } else if (arr1[i]>arr2[j]) {
                arr[k] = arr2[j];
                j++;
            }else{
                j++;
            }

            k++;

        }

        while (i<arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }





    }

    public static void mergeSort(int[] arr, int l, int r){

        int mid= (l+r)/2;

        if(l==r){
            return;
//
        }

        if(l<r){

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            mergeTwoArray(arr,l,r,mid);
        }
    }

    public static void mergeSort(int[] arr){
        int r = arr.length-1;
        int l=0;


        mergeSort(arr,l,r);
    }



    public static void main(String[] args) {


        int[] input = new int[]{2, 6, 8, 5, 4, 3};

        mergeSort(input);
        print(input);

    }
}