

public class DynamicArray{
    private int[] data;


    private int elementIndex;

    public DynamicArray(){
        this.data = new int[5];
        elementIndex=0;
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


}