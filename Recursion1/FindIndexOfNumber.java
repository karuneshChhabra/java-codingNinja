
class FindIndexOfNumber{


    public static int firstIndex(int input[], int x,int index) {

        if(index==input.length){
            return -1;
        }
        if(input[index]==x){
            return index;
        }

        return firstIndex(input,x ,index+1);
    }

    public static int firstIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return firstIndex(input,x,0);
    }



    public static void main(String[] args) {
        System.out.println(firstIndex(new int[]{3,6,9},6));
    }
}