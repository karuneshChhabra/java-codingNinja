
package oops;

public class ComplexNumbers {
    // Complete this class
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary){
       this.real =real;
       this.imaginary =imaginary;
    }

    public void print(){
        System.out.println(this.real + " + "+ "i"+this.imaginary);
    }

    public void multiply(ComplexNumbers c2){
        int real = this.real*c2.real+(-1)+this.imaginary*c2.imaginary;
        this.imaginary=this.real*c2.imaginary+this.imaginary*c2.real;
        this.real =real;
    }

    public void plus(ComplexNumbers c2){
        this.real=this.real+ c2.real;
        this.imaginary=this.imaginary+ c2.imaginary;
    }
}