


class CheckNumber {

    public static boolean checkNumber ( int input[], int x,int index){
        if(index==input.length){
            return false;
        }
        if(input[index]==x){
            return true;
        }
        return checkNumber(input,x,index+1);
    }



       public static boolean checkNumber ( int input[], int x){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

          return checkNumber(input,x,0);



    }
    public static void main(String[] args) {

        System.out.println(checkNumber(new int[]{3,6,9},2));
    }
}