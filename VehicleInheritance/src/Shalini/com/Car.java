package Shalini.com;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size, 20, 41);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int CurrentGear) {
        this.currentGear = currentGear;
        System.out.println(" Car. changeGear():changed to " + this.currentGear + " gear ");
    }

    public void changeVelocity(int speed, int direction) {

        System.out.println(" Car.changeVelocity(): velocity " + speed + " direction " + direction);
        move(speed, direction);
    }
}
