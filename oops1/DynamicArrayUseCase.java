

public class DynamicArrayUseCase {



    public static void main(String[] args) {

        DynamicArray d1 = new DynamicArray();
        Test t = new Test();

        d1.name=9;

        for(int i =0 ;i<100;i++){
            d1.add(100+i);
        }

        System.out.println(d1.getIndex(102));

        System.out.println(d1.getIndex(199));
        System.out.println(d1.size());

        System.out.println(d1.deleteValueAtLast());

        System.out.println(d1.getIndex(198));

        System.out.println(d1.getIndex(199));

        System.out.println(d1.size());











    }
}



class Test extends DynamicArray{

}

 class DynamicArray{
    private int[] data;
     public int name;
    private int elementIndex;

    public DynamicArray(){
        this.data = new int[5];
        elementIndex=0;
    }
    public int size(){
        return elementIndex;
    }

    public int getIndex(int element){


        for(int i=0;i<elementIndex;i++){
            if(data[i]==element){
                return i;
            }
        }
        return -1;

    }

    public void add(int elem){
        if(elementIndex ==data.length){
            increaseSize();
        }
        data[elementIndex] =elem;
        elementIndex++;
    }

    private void increaseSize() {

        int[] temp =  this.data;
        this.data = new int[temp.length*2];
        for(int i=0;i<elementIndex;i++){
            this.data[i] = temp[i];
        }
    }

    public boolean isEmpty(){
        return elementIndex==0;
    }

    public int deleteValueAtLast(){
        if(!isEmpty()){
            data[elementIndex]=0;
            elementIndex--;
        }
        return -1;
    }

}