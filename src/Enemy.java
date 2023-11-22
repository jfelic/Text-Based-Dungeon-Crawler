import java.util.Scanner;
import java.util.Random;

public class Enemy {
    public int maxHealth = 75;
    int currentHealth;
    public int maxAttackDamage = 25;
    String enemyType;
    String passive;
    public String[] enemyTypes = {"Terribly Tough Taffy", "Gummy Bear Barbarian", "Lollipop Lunatic", "Sweet Shooter"};

    Enemy(Random rand) {
        int typeIndex = rand.nextInt(enemyTypes.length);
        this.enemyType = enemyTypes[typeIndex];
        this.currentHealth = rand.nextInt(this.maxHealth);

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

    // Get Enemy Type //
    public String getEnemyType() {
        return this.enemyType;
    }

    // Is enemy alive check //
    public boolean isAlive() {
        if (this.currentHealth > 0 ) {
            return true;
        } else {
            return false;
        }
    }

    // Get Enemy Passive //
    public String getEnemyPassive() {
        return this.passive;
    }

    // Get Enemy Current Health //
    public int getCurrentHealth() {
        return this.currentHealth;
    }

    // Lose health //
    public void loseCurrentHealth(int attack) {
        this.currentHealth -= attack;
    }

    // Enemy attack //
    public void performAttack (Player player, Enemy enemy, Random rand, Scanner in) {
        if (enemy.isAlive() && !enemy.getEnemyType().equals("Sweet Shooter")) {
            int attackPercentage = rand.nextInt(101);
            if (attackPercentage <= 100 - (100 - player.getDodge())) {
                System.out.println("The " + enemy.getEnemyType() + " missed!"); 
                System.out.println("Your current health: " + player.getCurrentHealth());
                System.out.println(attackPercentage);
            } else {
                System.out.println();
                int attack = rand.nextInt(maxAttackDamage + 1);
                player.loseCurrentHealth(attack);
                System.out.println("The " + enemy.getEnemyType() + " hit you for " + attack + " damage!");
                System.out.println("Your current health: " + player.getCurrentHealth());
                System.out.println(attackPercentage);
            }   
        }
    }
}
