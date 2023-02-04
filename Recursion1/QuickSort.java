

public class QuickSort{

    public static void reArrange(int[] arr, int si,int ei,int elem){

        int i= si,j=ei;

        while (i<j){
            if(elem>arr[i]){
                i++;
            } else if (elem<=arr[ei]) {
                j--;
            }

            if(elem<arr[i] && elem >arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }

        System.out.println("rearrange");
        print(arr);
    }


    public static void quickSort(int[] input, int si, int ei) {
        // your code goes here
        System.out.println("---------------");
        System.out.println("si:"+si+" ei: "+ei);
        System.out.println("---------------");
        if(si>=ei){
            return;
        }




        int pi = input[si];
        int count=0;

        for(int i=si+1;i<=ei;i++){
            if(pi>input[i]){
                count++;
            }
        }


        int temp=pi;
        input[si]=input[si+count];
        input[si+count]=temp;
        int index = si+count;

        System.out.println("count "+count+" si:"+si+" ei: "+ei+"pi:"+pi);
        print(input);




        if(count>0 && index>si && index<ei) {
            reArrange(input, si, ei, input[index]);

        }

        if(index>si) {
            quickSort(input, si, index-1);
        }
        if(index <ei) {
            quickSort(input, index + 1, ei);
        }

    }

    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }



    public static void print(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 6, 8, 5, 4, 3,1};

        quickSort(input);
        print(input);
    }

        }