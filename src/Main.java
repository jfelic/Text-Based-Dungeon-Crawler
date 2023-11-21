import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;

        System.out.println("## Welcome to Candy Cavern! ##");
        System.out.println("--------------------------------------");
        System.out.println("1. Start");
        System.out.println("2. Credits");
        System.out.println("3. Exit");
        
        int userInput = in.nextInt();
        in.nextLine();

        // Handling user input from the menu //
        if (userInput == 1) {
            System.out.println("--------------------------------------");
            System.out.println("Mysterous Merchant: \"Greetings adventurer! I have a very important request, and from the looks of you, you're the one for the job.");
            System.out.println("The Candy King of Candy Cavern and his minions have been causing mayhem near our village and none of the traderoutes are safe.");
            System.out.println("Something must be done! What say you?\"");
            System.out.println("\n1. \"Don't worry, I will take care of the Candy King and his minions for you!\"\n2. \"No thanks, I'm busy.\"");
            int responseToMerchant = in.nextInt();
            in.nextLine();
            if (responseToMerchant == 1) {
                System.out.println("Mysterious Merchant: \"I knew I was right about you! Now then, what should I call you adventurer?\"");
                System.out.print("Input name: ");
                Player player = new Player(in);
            } else if (responseToMerchant == 2) {
                System.out.println("\nMysterious Merchant: \"No? It seems I was wrong about you... good day then!\"");
                System.out.println("Your journey ends before it even began. Not a very good run, but thanks for playing anyways!");
                System.out.println("--------------------------------------");
                System.out.println();
            }
        } else if(userInput == 2) {
            System.out.println("Created by Julian Feliciano");
            System.out.println("2023");
        } else {
            System.out.println("You've successfully exited, thank you for playing!");
        }

        // Saying Goodbye to the merchant //
        System.out.println("Mysterious Merchant: \"Well then, it looks like you're ready. Farewell and good luck!\"");
        System.out.print("Say your goodbye to the merchant: ");
        String goodbye = in.nextLine();
        System.out.println();
        System.out.println("With your goodbye said and done, you look down the path laid out before you. Looming far and high above is Candy Cavern. You begin walking....");
        System.out.println("--------------------------------------");

        // Entering the Cavern //

        // //Testing combat//
        // System.out.println("You encounter a " + Enemy enemy = new Enemy(rand));








        // // Main Methods //
        // void displayCombatOptions() {
        //     System.out.println("Choose an action:");
        //     System.out.println("1. Attack");
        //     System.out.println("2. Use Potion");
        //     System.out.println("3. Flee");
        // }

        // public void performAttack (Player player, Enemy enemy) {
        //     int damage = calculateDamage(player, enemy);
        //     enemy.takeDamage(damage);
        //     System.out.println("You dealt " + damage + " damage to the " + enemy.getType());
        }
}
