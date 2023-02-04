
public class MaximiseSum {

    public static long maximumSumPath(int[] input1, int[] input2) {

        long count = 0;

        long sum1 =0,sum2=0;
        if(input1.length==0 && input2.length==0){
            return count;
        }

        int i=0,j=0;
        for(;i<input1.length && j<input2.length;){

            if(input1[i]>input2[j]){
                sum2+=input2[j];
                j++;
            } else if (input1[i]<input2[j]) {
                sum1+=input1[i];
                i++;
            }else{
                count += Math.max(sum1,sum2);
                sum1=0;
                sum2=0;
                // equal case
                if(input1[i]==input2[j]){
                    count += input1[i];
                    i++;
                    j++;

                }
            }
        }

        while(i<input1.length){
            sum1+=input1[i];
            i++;
        }

        while(j<input2.length){
            sum2+=input2[j];
            j++;
        }

        count += Math.max(sum1,sum2);



        return count;
    }


//    6
//            1 5 10 15 20 25
//            5
//            2 4 5 9 15


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5, 10, 15, 20, 25};
        int[] arr2= { 2, 4, 5, 9, 15};

        System.out.println(maximumSumPath(arr1,arr2));
    }
}