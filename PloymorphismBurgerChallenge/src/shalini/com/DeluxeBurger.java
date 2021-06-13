package shalini.com;

public class DeluxeBurger extends HamBurger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "white");
        super.addHamBurgerAddition1("Chips", 2.75);
        super.addHamBurgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamBurgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to burger");
    }

    @Override
    public void addHamBurgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to burger");
    }

    @Override
    public void addHamBurgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to burger");
    }

    @Override
    public void addHamBurgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to burger");
    }
}
