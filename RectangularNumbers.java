import java.util.Scanner;

class RectangularNumbers{

//
//    33333           -->
//            32223
//            32123
//            32223
//            33333
    // num = num -i;
    // 1 --> num -1;
    // 2 = num -1  --> 2 --> num -2 --> 1 -->
    // n=3, i=1,n=2,

    public static void print(int n) {


        int num =n ;



        int noOfRows = 2*n -1;


        int startRow = 0;
        int endRow = noOfRows;

        int a[][] = new int[endRow][endRow];

        while(num!=0) {


            for (int i = startRow; i < endRow; i++) {
                for (int j = startRow; j < endRow; j++) {
                    if(i==startRow || i==endRow-1 || j==startRow || j==endRow-1){

                        a[i][j] = num;
                    }
                }
            }
            num--;
            startRow++;
            endRow--;

        }

        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<noOfRows;j++){
                System.out.print(a[i][j]);

            }
            System.out.println();
        }

//        for(int i=0;i<noOfRows;i++){
//            num=initial;
//            for(int j=0;j<noOfRows;j++){
//                if(i==0 || i==noOfRows-1 || j==0 || j==noOfRows-1){
//                    System.out.print(initial);
//                } else {
//                      if(i>j){
//                        num--;
//                      }
//                   // num--;
//                    System.out.print(num);
//                }
//
//
//            }
//            System.out.println();
//        }

    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
     print(n);
     s.close();
    }
}