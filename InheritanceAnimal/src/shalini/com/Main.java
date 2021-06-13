package shalini.com;

public class Main {
    public static void main(String args[]) {
        Animal animal = new Animal("Lucky", 1, 1, 5, 5);
        Dog dog = new Dog("Ruby", 8, 22, 2, 4, 1, 20, "Muffin");
        Fish fish = new Fish("GoldenFish", 7, 30, 7, 2, 2);
        dog.eat();
        dog.walk();
        //dog.run();
        // dog.move(11);
        fish.swim(6);

    }
}
