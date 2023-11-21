import java.util.Scanner;
import java.util.Random;

public class Enemy {
    public int maxHealth = 75;
    public int maxDamage = 25;
    String enemyType;
    String passive;
    public String[] enemyTypes = {"Terrible Taffy", "Gummy Bear Barbarian", "Lollipop Lunatic", "Assassin"};

    Enemy(Random rand) {
        int typeIndex = rand.nextInt(enemyTypes.length);
        this.enemyType = enemyTypes[typeIndex];
        System.out.println(this.enemyType);
        if (this.enemyType.equals("Terrible Taffy")) {
            this.passive = "Sticky Situation";
            this.maxHealth += 10;
        }
    }
}
