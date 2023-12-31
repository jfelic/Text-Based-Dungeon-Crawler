import java.util.Scanner;
import java.util.Random;

public class Player {
    String name;
    int fighterType;
    String passive;
    int maxHealth = 100;
    int currentHealth = 100;
    int maxAttackDamage = 50;
    int dodgePercentage = 5;
    int accuracy = 75;
    int luck = 15;
    int numOfHealthPotions = 3;
    int healthPotionValue = 30;
    int healthPotionDropChance = 5; //Percentage

    Player (Scanner in) {
        this.name = in.nextLine();
        System.out.println("--------------------------------------");
        System.out.println("Mysterious Merchant: \"Okay " + name + ", " + "how would you describe yourself?\"");
        System.out.println("1. Strong and reliable\n2. Intelligent/thinker\n3. Accurate and to the point\n4. Cunning when need be");
        fighterType = in.nextInt();
        in.nextLine();

        // Determining passive ability //
        do {
            if(this.fighterType == 1) {
            this.passive = "Candy Crusher";
            this.maxAttackDamage = 60;
            System.out.println("--------------------------------------");
            System.out.println("Mysterious Merchant: \"Oh so you're a Candy Crusher then, I see.\"");
            break;
            } else if(this.fighterType == 2){
            this.passive = "Wizard";
            this.numOfHealthPotions = 5;
            System.out.println("--------------------------------------");
            System.out.println("Mysterious Merchant: \"Oh so you're a Wizard then, I see.\"");
            break;
            } else if(this.fighterType == 3) {
            this.passive = "Archer";
            this.accuracy = 95;
            System.out.println("--------------------------------------");
            System.out.println("Mysterious Merchant: \"Oh so you're a Archer then, I see.\"");
            break;
            } else if(this.fighterType == 4){
            this.passive = "Rogue";
            this.dodgePercentage = 20;
            System.out.println("--------------------------------------");
            System.out.println("Mysterious Merchant: \"Oh so you're a Rogue then,\"");
            break;
            } else {
            System.out.println("--------------------------------------");
            System.out.println("## Invalid Input ##");
            fighterType = in.nextInt();
            in.nextLine();
        }
    } while (1 != 0);

        /* ---Stat Allocation---
         * maxHealth
         * maxAttackDamage
         * accuracy
         * dodgePercentage
         * luck
         */
        for(int i = 5; i > 0; i--) {
            System.out.println("You have " + i + " stat points remaining to allocate. Where would you like to put them?");
            System.out.println("\n1. Max Health (max health + 5)\n2. Max Damage (max damage + 2)\n3. Accuracy (accuracy + 2)\n4. Dodge Chance (dodge chance + 2)\n5. Luck (luck + 5)");
            int userStatChoice = in.nextInt();
            if (userStatChoice == 1) {
                this.maxHealth += 5;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else if (userStatChoice == 2) {
                this.maxAttackDamage += 2;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else if (userStatChoice == 3) {
                this.accuracy += 2;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else if (userStatChoice == 4) {
                this.dodgePercentage += 2;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else if (userStatChoice == 5){
                this.luck += 5;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else {
                System.out.println("--------------------------------------");
                System.out.println("## Invalid input ##");
                i++;
            }
        }
        in.nextLine();
    }


//------------ GETTERS----------//
    // Get player passive //
    public String getPassive() {
        return this.passive;
    }

    // Get Max Attack Damage //
    public int getMaxAttack () {
        return this.maxAttackDamage;
    }

    // Get current health //
    public int getCurrentHealth () {
        return this.currentHealth;
    }

    // Get Accuracy //
    public int getAccuracy() {
        return this.accuracy;
    }

    // Get Dodge //
    public int getDodge() {
        return this.dodgePercentage;
    }

    // Get health potion count //
    public int getHealthPotionCount() {
        return this.numOfHealthPotions;
    }

    // handle combat option //
    public void handleCombatOption(Player player, Enemy enemy, Random rand, Scanner in, int combatOption) {
        if (combatOption == 1) {
            player.performAttack(player, enemy, rand, in);
        } else if (combatOption == 2) {
            player.drinkHealthPotion(player);
        } else if (combatOption == 3) {
            player.flee();
        }
    }

    // Is player alive check //
    public boolean isAlive() {
        if (this.currentHealth > 0 ) {
            return true;
        } else {
            return false;
        }
    }

    // Player Attack //
    public void performAttack (Player player, Enemy enemy, Random rand, Scanner in ) {
        if (rand.nextInt(101) <= player.getAccuracy()) {
            int attack = rand.nextInt(player.getMaxAttack() + 1);
            System.out.println("You hit " + enemy.getEnemyType() + " for " + attack + " damage");
            enemy.loseCurrentHealth(attack);
        } else {
            System.out.println("You missed!");
        }
        if (enemy.getCurrentHealth() > 0) {
            System.out.println(enemy.getEnemyType() + "'s current health: " + enemy.getCurrentHealth());    
        } else {
            System.out.println("Enemy defeated!");
            player.healthPotionDrop(rand, enemy);
        }

    }

    // Drink Potion //
    public void drinkHealthPotion(Player player) {
        if (player.getHealthPotionCount() > 0) {
            this.currentHealth += healthPotionValue;   
        } else {
            System.out.println("You don't have any health potions left!");
        }
    }

    // Attempt to flee //
    public void flee() {
        double fleeChance = this.luck / 100;

    }

    // Chance of potion drop //
    public void healthPotionDrop(Random rand, Enemy enemy) {
        int potionDrop = rand.nextInt(100);
        if (potionDrop >=0 && potionDrop <= 5) {
            this.numOfHealthPotions += 1;
            System.out.println("The " + enemy.getEnemyType() + " dropped a potion! You've added it to your inventory.");
            System.out.println("Total potions = " + this.numOfHealthPotions);
        }
    }

    // Lose health //
    public void loseCurrentHealth(int attack) {
        this.currentHealth -= attack;
    }


}
