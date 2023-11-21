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
        System.out.println("Okay " + name + ", " + "What kind of fighter would you describe yourself as?: ");
        System.out.println("1. Strong\n2. Intellectual\n3. Accurate\n4. Cunning");
        fighterType = in.nextInt();
        in.nextLine();

        // Determining passive ability //
        if(this.fighterType == 1) {
            this.passive = "Candy Crusher";
            this.maxAttackDamage = 60;
            System.out.println("Oh so you're a Candy Crusher then, I see. What do you think are your strengths?");
        } else if(this.fighterType == 2){
            this.passive = "Wizard";
            this.numOfPotions = 5;
            System.out.println("Oh so you're a Wizard then, I see. What do you think are your strengths?");
        } else if(this.fighterType == 3) {
            this.passive = "Archer";
            this.accuracy = 95;
            System.out.println("Oh so you're a Archer then, I see. What do you think are your strengths?");
        } else {
            this.passive = "Assassin";
            this.dodgePercentage = 20;
            System.out.println("Oh so you're a Assassin then, I see. What do you think your strengths are?");
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
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\n Dodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);

            } else if (userStatChoice == 2) {
                this.maxAttackDamage += 2;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\n Dodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);

            } else if (userStatChoice == 3) {
                this.accuracy += 1;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\n Dodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);

            } else if (userStatChoice == 4) {
                this.dodgePercentage += 2;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\n Dodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);

            } else {
                this.luck += 5;
                System.out.printf("Max Health: %d\nMax Damage: %d\nAccuracy: %d\n Dodge Percentage: %d\nLuck: %d\n", this.maxHealth, this.maxAttackDamage,this.accuracy,this.dodgePercentage,this.luck);
            }
        }
        in.nextLine();

        
        
 
    }
}
