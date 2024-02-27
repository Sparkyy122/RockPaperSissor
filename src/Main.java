import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Stating Global variables
        boolean gameRunning = true;
        Scanner input = new Scanner(System.in);

        while (gameRunning) {
            // Computer Player
            String[] shapes = new String[]{"Rock", "Paper", "Scissor", "Exit"};
            Random random = new Random();
            int computerInput = random.nextInt(3);
            String computerMove = shapes[computerInput];
            // Player
            System.out.println("-----------------");
            System.out.println("0: Rock");
            System.out.println("1: Paper");
            System.out.println("2: Scissor");
            System.out.println("3: Exit");
            int playerInput = input.nextInt();


            String playerMove = shapes[playerInput];
            if(playerInput == 3){
                gameRunning = false;
            }
            else if (playerInput == computerInput) {
                System.out.println("Player: " + playerMove + " Computer: " + computerMove + " Which resulted in:");
                System.out.println("Draw");
            } else if (playerInput == 0 && computerInput == 2 || playerInput == 1 && computerInput == 0 || playerInput == 2 && computerInput == 1) {
                System.out.println("Player: " + playerMove + " Computer: " + computerMove + " Which resulted in:");
                System.out.println("WIN");
            } else {
                System.out.println("Player: " + playerMove + " Computer: " + computerMove + " Which resulted in:");
                System.out.println("Loss");
            }

        }
    }
}
