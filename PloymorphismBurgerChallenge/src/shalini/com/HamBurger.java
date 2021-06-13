package shalini.com;

public class HamBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollTypes;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public HamBurger(String name, String meat, double price, String breadRollTypes) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollTypes = breadRollTypes;
    }

    public void addHamBurgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamBurgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamBurgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamBurgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamBurgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollTypes + " roll with " + this.meat + " Price is " + this.price);
        if (this.addition1Name != null) {
            hamBurgerPrice += this.addition1Price;
            System.out.println(" Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamBurgerPrice += this.addition2Price;
            System.out.println(" Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamBurgerPrice += this.addition3Price;
            System.out.println(" Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamBurgerPrice += this.addition4Price;
            System.out.println(" Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamBurgerPrice;
    }

}
