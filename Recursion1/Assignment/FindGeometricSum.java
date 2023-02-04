

class FindGeometricSum{


    //1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
    public static double findGeometricSum(int k,double num){

        if(k==0){
            return 0.0;
        }

        return num + findGeometricSum(k-1,num/2.0);

    }

    public static double findGeometricSum(int k){
        // Write your code here
      if(k>0) {
          return findGeometricSum(k + 1, 1.0);
      }else {
          return 0.0;
      }



    }

    public static void main(String[] args) {
        //1.87500
        double ans = findGeometricSum(4);
        System.out.println(ans);
    }
}