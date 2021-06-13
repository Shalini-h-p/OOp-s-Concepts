public class Main {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(" rectangle.Width= " + rectangle.getWidth());
        System.out.println(" rectangle.Length= " + rectangle.getLength());
        System.out.println(" rectangle.Area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println(" cuboid.Width= " + cuboid.getWidth());
        System.out.println("cuboid.Length= " + cuboid.getLength());
        System.out.println(" cuboid.Area= " + cuboid.getArea());
        System.out.println("cuboid.Height= " + cuboid.getHeight());
        System.out.println("cuboid.Volume= " + cuboid.getVolume());
    }
}
