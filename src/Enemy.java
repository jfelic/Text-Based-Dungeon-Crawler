import java.util.Scanner;
import java.util.Random;

public class Enemy {
    public int maxHealth = 75;
    public int maxAttackDamage = 25;
    String enemyType;
    public String[] enemyTypes = {"Skeleton", "Zombie", "Warrior", "Assassin"};

    Enemy(Random rand) {
        int typeIndex = rand.nextInt(enemyTypes.length);
        this.enemyType = enemyTypes[typeIndex];
        System.out.println(this.enemyType);
    }
}
