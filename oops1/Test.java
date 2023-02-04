public abstract class Test {

    static  int value=10;
    // static block
    static {
        System.out.println("inside static 1 "+value);
    }
    static
    {
        System.out.println("Inside Static Block. 2");

    }

    public void testvalue(){

    }
    static {
        System.out.println("inside static block 3 "+value);
        value =20;
    }

    public void print(){
        System.out.println("inside print block 3 test "+value);
    }

    // main method
    public static void main(String args[])
    {

        System.out.println("Inside main method.");
        System.out.println(value);

        Test2 testValue = new Test2();
        testValue.print();
    }
}


class  Test2 extends Test{

    Test2(){
        System.out.println("inside print block 3 "+value);
        //super();
    }

    public void print(){
        System.out.println("inside print block 3 "+value);
        super.print();
    }



}