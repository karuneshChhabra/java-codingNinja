

class SplitArray{
    public static boolean splitArray(int input[],int si,int sum1,int sum2) {


        if(si==input.length){
            return sum1==sum2;
        }

            if(input[si]%5==0){
                sum1=sum1+input[si];
            } else if (input[si]%3==0) {
                sum2=sum2+input[si];
            }else{
                return splitArray(input,si+1,sum1+input[si],sum2) ||   splitArray(input,si+1,sum1,sum2+input[si]);
            }
        return splitArray(input,si+1,sum1,sum2);
        }







    public static boolean splitArray(int input[]) {
        return  splitArray(input,0,0,0);
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 3,2,2};

        System.out.println(splitArray(arr));

    }
}