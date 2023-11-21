import java.util.Scanner;
import java.util.Random;

public class Player {
    String name;
    int fighterType;
    String passive;
    int maxHealth = 100;
    int maxAttackDamage = 50;
    int dodgePercentage = 5;
    int accuracy = 85;
    int luck = 15;
    int numOfPotions = 3;
    //int healthPotionValue = 30;
    //int healthPotionDropChance = 50; //Percentage

    Player (Scanner in) {
        System.out.println("What is your name?: ");
        this.name = in.nextLine();
        System.out.println("\nOkay " + name + ", " + "how would you describe yourself?");
        System.out.println("1. Strong and reliable\n2. Intelligent/thinker\n3. Accurate and to the point\n4. Cunning when need be");
        fighterType = in.nextInt();
        in.nextLine();

        // Determining passive ability //
        if(this.fighterType == 1) {
            this.passive = "Candy Crusher";
            this.maxAttackDamage = 60;
            System.out.println("--------------------------------------");
            System.out.println("Oh so you're a Candy Crusher then, I see.");
        } else if(this.fighterType == 2){
            this.passive = "Wizard";
            this.numOfPotions = 5;
            System.out.println("--------------------------------------");
            System.out.println("Oh so you're a Wizard then, I see.");
        } else if(this.fighterType == 3) {
            this.passive = "Archer";
            this.accuracy = 95;
            System.out.println("--------------------------------------");
            System.out.println("Oh so you're a Archer then, I see.");
        } else {
            this.passive = "Rogue";
            this.dodgePercentage = 20;
            System.out.println("--------------------------------------");
            System.out.println("Oh so you're a Rogue then,");
        }

        /* ---Stat Allocation---
         * maxHealth
         * maxAttackDamage
         * accuracy
         * dodgePercentage
         * luck
         */
        for(int i = 5; i > 0; i--) {
            System.out.println("You have " + i + " stat points remaining to allocate. Where would you like to put them?");
            System.out.println("\n1. Max Health\n2. Max Damage\n3. Accuracy\n4. Dodge Chance\n5. Luck");
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
                this.accuracy += 1;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else if (userStatChoice == 4) {
                this.dodgePercentage += 2;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            } else {
                this.luck += 5;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\nDodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
                System.out.println("--------------------------------------");
            }
        }
        in.nextLine();

        
        
 
    }
}
