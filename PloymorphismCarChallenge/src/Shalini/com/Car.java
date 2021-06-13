package Shalini.com;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "car->start engine";
    }

    public String accelerate() {
        return "car->accelerate";
    }

    public String brake() {
        return "car->brake";
    }
}

class Sedan extends Car {
    public Sedan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Sedan->start engine";
    }

    @Override
    public String accelerate() {
        return "Sedan->accelerate";
    }

    @Override
    public String brake() {
        return "Sedan->brake";
    }

}

class Verna extends Car {
    public Verna(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Verna->start engine";
    }

    @Override
    public String accelerate() {
        return "Verna->accelerate";
    }

    @Override
    public String brake() {
        return "Verna->brake";
    }
}
