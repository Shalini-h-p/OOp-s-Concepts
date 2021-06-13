package Shalini.com;

public class Main {
    public static void main(String args[]) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("North");
        // System.out.println(wall1. getDirection());
        Ceiling ceiling = new Ceiling(5, 55);
        // System.out.println(ceiling.getHeight());
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 5);
        Bedroom bedroom = new Bedroom("Shalu", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
