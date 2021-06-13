package shalini.com;

public class Main {
    public static void main(String args[]) {
        ComplexNumbers one = new ComplexNumbers(1.0, 1.0);
        ComplexNumbers number = new ComplexNumbers(2.5, -1.5);
        one.add(1, 1);
        System.out.println(" one.real= "+one.getReal());
        System.out.println(" one.imaginary= "+one.getImaginary());
        one.subtract(number);
        System.out.println(" one.real= "+one.getReal());
        System.out.println(" one.imaginary= "+one.getImaginary());
        number.subtract(one);
        System.out.println(" number.real= "+number.getReal());
        System.out.println(" number.imaginary= "+number.getImaginary());
    }
}
