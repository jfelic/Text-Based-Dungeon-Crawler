import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean running = true;
        System.out.println("## Welcome to Candy Cavern! ##");
        System.out.println("Main Menu:");
        System.out.println("1. Start");
        System.out.println("2. Credits");
        System.out.println("3. Exit");
        
        int userInput = in.nextInt();
        in.nextLine();

        if (userInput == 1) {
            GAME:
            while(running) {
                System.out.println("--------------------------------------");
                System.out.println("Greetings adventurer! I have a very important request, and from the looks of you, you're the one for the job.");
                Player player = new Player(in);

                Enemy enemy = new Enemy(rand);
                System.out.println("--------------------------------------");
                running = false;
            }
        } else if(userInput == 2) {
            System.out.println("Created by Julian Feliciano");
            System.out.println("2023");
        } else {
            System.out.println("You've successfully exited, thank you for playing!");
        }




    }
}
