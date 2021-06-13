package shalini.com;

public class HealthyBurger extends HamBurger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

    }

    @Override
    public double itemizeHamburger() {
        double hamBurgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamBurgerPrice += this.healthyExtra1Price;
            System.out.println(" Added " + this.healthyExtra1Name + " for an Extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamBurgerPrice += this.healthyExtra2Price;
            System.out.println(" Added " + this.healthyExtra2Name + " for an Extra " + this.healthyExtra2Price);
        }
        return hamBurgerPrice;
    }
}
