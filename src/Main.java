import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean running = true;
        System.out.println("Welcome to the Dungeon!");

        GAME:
        while(running) {
            System.out.println("--------------------------------------");
            Enemy enemy = new Enemy(rand);
            System.out.println("--------------------------------------");
            running = false;
        }


    }
}
