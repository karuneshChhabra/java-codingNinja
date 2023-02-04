

class CountZeros{

    public static int countZerosRec(int input){

        int count=0;
        if(input<10){
            if(input==0){
                return 1;
            }else {

                return count;
            }
        }

        if(input%10==0){
            count++;
        }



        return  count+ countZerosRec(input/10);

    }



    public static void main(String[] args) {

        System.out.println(countZerosRec(70008));
    }
}