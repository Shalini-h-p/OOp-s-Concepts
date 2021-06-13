package Shalini.com;

public class EnhancedPlayer {
    public String name;
    public int hitPoints =100;
    public String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        } else {
            this.weapon = weapon;
        }
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints < 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }

}
