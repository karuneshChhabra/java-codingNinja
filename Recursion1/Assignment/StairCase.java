

class StairCase{


    public static int staircase(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(n==1){
            return 1;
        }

        if(n==0){
            return 1;
        }

        if(n<-1){
            return 0;
        }



        int x= staircase(n-1);
        int y= staircase(n-2);
        int z =staircase(n-3);

        return x+y+z;




    }

    public static void main(String[] args) {


        System.out.println(staircase(3));
    }
}