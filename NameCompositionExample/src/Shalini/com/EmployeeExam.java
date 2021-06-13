package Shalini.com;

public class EmployeeExam {
    private int age;
    private Name n;

    public void display(int age, Name n) {
        System.out.println(" Age: " + age);
        System.out.println(" Full Name: " + n.firstName + " " + n.middleName + " " + n.lastName);
    }
}
