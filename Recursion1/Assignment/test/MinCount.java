

class MinCount{

    public static int minCount(int n){
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
        int value = (int)Math.sqrt(n);

        if(n==Math.pow(value,2)){
            return 1;
        }
        int ans =n;

        System.out.println("call");

        for(int i=2;i<value+1;i++) {
            int square =i*i;
            if(square>n){
                break;
            }
            ans = Math.min(ans,minCount(n-square)+1);
        }
        return ans;




    }


//    public static int minCount(int n){
//        /* Your class should be named Solution
//         * Don't write main().
//         * Don't read input, it is passed as function argument.
//         * Return output and don't print it.
//         * Taking input and printing output is handled automatically.
//         */
//        if(n==0){
//            return 0;
//        }
//
//        if(n==1){
//            return 1;
//        }
//        int value = (int)Math.sqrt(n);
//
//        System.out.println(value);
//
//        if(n==Math.pow(value,2)){
//            return 1;
//        }
//        if(n>4){
//            return 1+minCount(n-4);
//        }
//
//
//
//        return n;
//
//
//
//
//    }
//




    public static void main(String[] args) {

//        System.out.println(minCount(9));
//        System.out.println(minCount(12));
//        System.out.println(minCount(25));
//        System.out.println(minCount(26));
       // System.out.println(minCount(27));
//
//        Test object = new Test();
//        object.set(10,20);
//        object.display();

//        Test t=new Test();
//        t.set_marks(78);                //Line 2
//        System.out.print(Test.marks);   //Line 3
        Test.fun1();


    }
}

class Test
{
    static int a = 10;
    int b = 20;
    static void fun1()
    {
        a = 20;                             //Line 1
        b = 10;                             //Line 2
        fun2();                             //Line 3
        System.out.print(this.b);           //Line 4
    }
    void fun2()
    {
        System.out.println("from m2");
    }
}