

class print2D{

    public static void print2DArray(int input[][],int rowIndex) {
        // Write your code here
        int n= input.length;
        if(rowIndex==input.length){
            return ;
        }
        while(n-rowIndex>0) {
            for (int i = 0; i < input[0].length; i++) {
                System.out.print(input[rowIndex][i] +" ");
            }
            System.out.println();
            n--;
        }
        print2DArray(input,rowIndex+1);
    }

    public static void print2DArray(int input[][]) {
        // Write your code here
        print2DArray(input,0);
    }



    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4, 5, 6}, { 7, 8, 9,}};
        print2DArray(arr1);
    }
}