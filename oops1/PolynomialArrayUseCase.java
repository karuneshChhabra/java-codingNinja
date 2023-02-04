import java.util.*;

public class PolynomialArrayUseCase {


//    P1 : 1x2 2x3 4x6
//    P2 : 3x4 1x2
//     2
//     1 2
//     1 2
//     2
//     1 2
//     1 2
//     1

    //1x +2x2 +1x+2x2

    // expected - 2x1 4x2
    // 3 -- 1x2 4x3 4x4



//    The first line of input contains count of the number of coefficients in polynomial 1(C1)
//    The next line of input has C1 degrees for polynomial 1.
//    The next line of input has C1 coefficients for polynomial 1.
//    The next line of input contains count of the number of coefficients in polynomial 2(C2)
//    The next line of input has C2 degrees for polynomial 2.
//    The next line of input has C2 coefficients for polynomial 2.
//    The next line of input has the choice for the function you want to implement.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }

        first.print();
        n = s.nextInt();
        int degree2[] = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }

        second.print();
        int choice = s.nextInt();
        Polynomial result;
        switch(choice){
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2 :
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3 :
                result = first.multiply(second);
                result.print();
                break;
        }

    }






}



class Polynomial {
    DynamicArray coeff;

    public Polynomial(){
        this.coeff = new DynamicArray();
    }

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){

        if(this.coeff.getElementIndex()>degree){
            this.coeff.addElemSpecificIndec(coeff,degree);
        }else {
            addOrPassValues(degree);
            this.coeff.add(coeff);
        }


    }

    private void addOrPassValues(int degree){

        for(int i=this.coeff.getElementIndex();i<degree;i++){
            this.coeff.add(0);
        }
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){

        int[] data= this.coeff.getData();
        for(int i =0;i<this.coeff.getElementIndex();i++){
            if(data[i]!=0){
                System.out.print(data[i]+"x"+i+" ");
            }
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        int i=0,j=0;
        for (;i<this.coeff.getElementIndex() && j<p.coeff.getElementIndex();i++,j++){
            this.coeff.getData()[i] = this.coeff.getData()[i] + p.coeff.getData()[i];
        }
        while(i<this.coeff.getElementIndex()){
            this.coeff.getData()[i] = this.coeff.getData()[i];
            i++;
        }


        while(j<p.coeff.getElementIndex()){
            if(i>=this.coeff.getElementIndex()){
                this.coeff.add(p.coeff.getData()[j]);
            }else {
                this.coeff.getData()[i] = p.coeff.getData()[j];
            }
            j++;
            i++;
        }


        return this;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        int i=0,j=0;
        for (;i<this.coeff.getElementIndex() && j<p.coeff.getElementIndex();i++,j++){
            this.coeff.getData()[i] = this.coeff.getData()[i] - p.coeff.getData()[i];
        }
        while(i<this.coeff.getElementIndex()){
            this.coeff.getData()[i] = this.coeff.getData()[i];
            i++;
        }

        while(j<p.coeff.getElementIndex()){
            if(i>=this.coeff.getElementIndex()){
                this.coeff.add((-p.coeff.getData()[j]));
            }else {
                this.coeff.getData()[i] = -p.coeff.getData()[j];
            }
            j++;
            i++;
        }
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){

        Polynomial value2 = new Polynomial();
        int k=0;

        for (int i=0;i<this.coeff.getElementIndex();i++){
            Polynomial tempPoly = new Polynomial();
            while (!tempPoly.coeff.isEmpty()) {
                tempPoly.coeff.deleteValueAtLast();
            }

            for(int j=0;j<p.coeff.getElementIndex();j++) {
                int value = this.coeff.getData()[i] * (p.coeff.getData()[j]);
                tempPoly.setCoefficient(i+j,value);
            }

            //tempPoly.print();

            if(value2.coeff.isEmpty()){

                for (int l=0;l<tempPoly.coeff.getElementIndex();l++){
                    value2.setCoefficient(l,tempPoly.coeff.getData()[l]);
                }
            }else {
                if(tempPoly.coeff.getElementIndex()>0) {
                    value2.add(tempPoly);
                }
            }
           // value2.print();

        }

       // value2.print();




        return value2;
    }

}


 class DynamicArray{
    private int[] data;
    private int elementIndex;

    public int[] getData(){
         return this.data;
    }

    public int getElementIndex(){
        return this.elementIndex;
    }

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
        if(elementIndex == data.length){
            increaseSize();
        }
        data[elementIndex] = elem;
        elementIndex++;
    }

    public void addElemSpecificIndec(int elem , int index){
        data[index]=elem;
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