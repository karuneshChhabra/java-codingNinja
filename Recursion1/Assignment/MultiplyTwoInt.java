

class MultiplyTwoInt{


    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here

        if(n==1){
            return m;
        }

        return m+multiplyTwoIntegers(m,n-1);

    }

    public static void main(String[] args) {

        System.out.println(multiplyTwoIntegers(3,5));
    }
}