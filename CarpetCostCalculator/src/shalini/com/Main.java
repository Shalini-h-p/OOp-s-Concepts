package shalini.com;

public class Main {
    public static void main(String args[]) {
        Floor f = new Floor(3, 2);
        System.out.println("area=" + f.getArea());
        f = new Floor(27.5, 4.0);
        System.out.println("area=" + f.getArea());
    }
}
