package shalini.com;

public class Main {
    public static void main(String args[]) {
        HamBurger hamBurger = new HamBurger(" Basic ", "Sausage", 3.56, "White");
        double price = hamBurger.itemizeHamburger();
        hamBurger.addHamBurgerAddition1("Tomato", 0.27);
        hamBurger.addHamBurgerAddition2("Lettuce", 0.75);
        hamBurger.addHamBurgerAddition3("Tomato", 1.13);
        System.out.println(" Total Burger price is " + hamBurger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamBurgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.14);
        System.out.println(" Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamBurgerAddition3("should not do this", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}
