import java.util.Scanner;
import java.util.Random;

public class Enemy {
    public int maxHealth = 75;
    public int maxAttackDamage = 25;
    String enemyType;
    String passive;
    public String[] enemyTypes = {"Terribly Tough Taffy", "Gummy Bear Barbarian", "Lollipop Lunatic", "Sweet Shooter"};

    Enemy(Random rand) {
        int typeIndex = rand.nextInt(enemyTypes.length);
        this.enemyType = enemyTypes[typeIndex];
        System.out.println(this.enemyType);

        // Determining Passive ability //
        if (this.enemyType.equals("Terribly Tough Taffy")) {
            this.passive = "Health Up";
            this.maxHealth = 85;
        } else if(this.enemyType.equals("Gummy Bear Barbarian")) {
            this.passive = "Life-steal";
        } else if(this.enemyType.equals("Lollipop Lunatic")) {
            this.passive = "Lollipop Smack";
            this.maxAttackDamage = 30;
        } else {
            this.passive = "Dual Wield";
            this.maxAttackDamage = 15;
        }
    }
}
