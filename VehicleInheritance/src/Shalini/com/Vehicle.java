package Shalini.com;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
        this.name = name;
        this.size = size;

        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println(" Vehicle.Steer(): Steering at " + currentDirection + " degrees ");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println(" Vehicle.move(): moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }

}
