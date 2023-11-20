import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean running = true;
        System.out.println("Welcome to the Dungeon!");
        System.out.println("What would you like to do:");
        System.out.println("1. Enter the Dungeon");
        System.out.println("2. Go back home");
        
        int userInput = in.nextInt();
        if (userInput == 1) {
            GAME:
            while(running) {
                System.out.println("--------------------------------------");
                Enemy enemy = new Enemy(rand);
                System.out.println("--------------------------------------");
                running = false;
            }
        } else {
            System.out.print("You've decided against entering the dungeon. ");
            System.out.println("You will never know what treasures awaited you.");
        }




    }
}
