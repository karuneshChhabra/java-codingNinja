

class SumOfNum{


    public static  int sumN(int input[],int i){
        if(i==-1){
            return 0;
        }
        return input[i] + sumN(input,i-1);

    }


    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */


        return sumN(input,input.length-1);

    }



    public static void main(String[] args) {

        System.out.println(sum(new int[]{3,6,9}));

    }
}