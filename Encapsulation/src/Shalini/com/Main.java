package Shalini.com;

public class Main {
    public static void main(String args[]) {
//        Player player = new Player();
//        player.name = "shalu";
//        player.health = 30;
//        player.weapon = "sword";
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println(" Remaining health= "+player.healthRemaining());
//
//        damage=11;
//        player.loseHealth(damage);
//        System.out.println(" Remaining health="+player.healthRemaining());
//
//    }


        EnhancedPlayer ep= new EnhancedPlayer("shalini",20,"Sword");
        System.out.println("Initial health is=" +ep.getHealth());




    }
}