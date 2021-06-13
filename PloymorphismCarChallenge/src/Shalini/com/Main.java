package Shalini.com;

public class Main {
    public static void main(String args[]) {
        Car car = new Car(8, "base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Sedan sedan = new Sedan(8, "base car");
        System.out.println(sedan.startEngine());
        System.out.println(sedan.accelerate());
        System.out.println(sedan.brake());


        Verna verna = new Verna(8, "base car");
        System.out.println(verna.startEngine());
        System.out.println(verna.accelerate());
        System.out.println(verna.brake());

        Holden holden = new Holden(8, "base car");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}
