
class FindLastIndex{

    public static int lastIndex2(int input[], int x,int index) {
        if(index==input.length){
            return -1;
        }

        int value = lastIndex2(input,x,index+1);

        if(value ==-1 && input[index] ==x){
            return index;
        }else{
            return value;
        }

    }


        public static int lastIndex2(int input[], int x) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
             * Taking input and printing output is handled automatically.
             */
            return lastIndex2(input,x,0);
        }

    public static int lastIndex(int input[], int x,int index) {


        if(index<=-1){
            return -1;

        }
        if(input[index] ==x){
            return index;
        }
        return lastIndex(input,x,index-1);

    }

    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
       return lastIndex(input,x,input.length-1);
    }






    public static void main(String[] args) {
        System.out.println(lastIndex2(new int[]{3,6,9,7,5,3,2,33,2,3,9,7,8,6},3));
    }
}