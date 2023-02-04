

class Test{



    public static int minCount(int n,){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }
        System.out.println(count);

        if(n>Math.pow(count,count)){
            count++;
            System.out.println(count);
        }

        return 1+minCount(n-1,count);



    }


    public static void main(String[] args) {


        System.out.print(minCount(5,1));
    }
}