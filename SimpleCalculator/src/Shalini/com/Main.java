package Shalini.com;

public class Main {
    public static void main(String args[]){
SimpleCalculator calculator=new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println(" Addition of numbers= "+calculator.getAdditionResult());
System.out.println(" Subtraction of numbers= "+calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println(" Multiplication of numbers= "+calculator.getMultiplicationResult());
System.out.println(" Division of numbers= "+calculator.getDivisionResult());
    }
}
