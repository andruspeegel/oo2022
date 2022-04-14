package Homework;

public class HomeMAIN {
    public static void main(String[] args) {
        System.out.println("Dragon spotted");
        Dragon dragon = new Dragon();
        dragon.Wander();
        dragon.turnHostileonSight();
        System.out.println();

        System.out.println("Skeleton spotted");
        Skeleton skeleton = new Skeleton();
        skeleton.Wander();
        System.out.println();

        System.out.println("Mountain Goat spotted");
        MountainGoat mountainGoat = new MountainGoat();
        mountainGoat.Wander();
        System.out.println();

        System.out.println("Unicorn spotted");
        Unicorn unicorn = new Unicorn();
        unicorn.Wander();
        unicorn.runAwayonHit();
    }
}
