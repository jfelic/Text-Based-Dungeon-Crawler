import java.util.Scanner;
import java.util.Random;

public class Player {
    String name;
    int fighterType;
    String passive;
    int maxHealth = 100;
    int maxAttackDamage = 50;
    int numOfPotions = 3;
    //int healthPotionValue = 30;
    //int healthPotionDropChance = 50; //Percentage

    Player (Scanner in) {
        System.out.println("What is your name?: ");
        this.name = in.nextLine();
        System.out.println("Okay " + name + ", " + "What kind of fighter would you describe yourself as?: ");
        System.out.println("1. Warrior\n2. Wizard\n3. Archer\n4. Assassin");
        fighterType = in.nextInt();
        in.nextLine();
        if(fighterType == 1) {
            this.passive = "Candy Crusher";
            maxAttackDamage += 10;
        }

        else if(fighterType == 2){
            this.passive = "Wizard";
        }
    }
}
