package Shalini.com;

public class Lamp {
    private String styles;
    private boolean battery;
    private int globRating;

    public Lamp(String styles, boolean battery, int globRating) {
        this.styles = styles;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp-turnOn");
    }

    public String getStyles() {
        return styles;
    }

    public boolean battery() {
        return battery;
    }

    public int globRating() {
        return globRating;
    }
}
