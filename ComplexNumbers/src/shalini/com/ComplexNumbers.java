package shalini.com;

public class ComplexNumbers {
    private double real;
    private double imaginary;


    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumbers number) {
        this.real = this.real + number.getReal();
        this.imaginary = this.imaginary + number.getImaginary();
    }
    public void subtract(double real,double imaginary){
        this.real=this.real-this.real;
        this.imaginary=this.imaginary-this.imaginary;
    }
    public void subtract(ComplexNumbers number){
        this.real=this.real-number.getReal();
        this.imaginary=this.imaginary-number.getImaginary();
    }

}
