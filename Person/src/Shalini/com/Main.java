package Shalini.com;

public class Main {
    public static void main(String args[]) {
        Person p = new Person();
        p.setFirstName("Shalini");
        p.setLastName("Hullenahalli Papegowda");
        p.setAge(15);

        System.out.println(" FIRST NAME= " + p.getFirstName());
        System.out.println(" LAST NAME= " + p.getLastName());
        System.out.println(" AGE is: " + p.getAge());
        System.out.println("Teenage: " + p.isTeenage());

        p.setAge(70);
        System.out.println(" AGE is: " + p.getAge());
        System.out.println("Teenage: " + p.isTeenage());
        System.out.println("Full Name is: " + p.getFullName());
    }
}
