package shalini.com;

public class Main {
    public static void main(String args[]) {

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2500.00);
        System.out.println(person2.getCreditLimit());

        VipPerson person3 = new VipPerson("Shalu", 43000.00, "Shalu@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
