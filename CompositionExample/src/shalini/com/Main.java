package shalini.com;

public class Main {
    public static void main(String args[]) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("240", "Dell", "120", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2500, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, 44);

        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.getMonitor().drawPixelAt(1500, 1200, "red");
        thePc.getMotherboard().loadProgramName("Windows 1.0");
        thePc.getTheCase().pressPasswordButton();
    }
}
