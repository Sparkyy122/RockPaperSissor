import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] shapes = {"Rock", "Paper", "Scissor", "Exit"};
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {
            int computerInput = random.nextInt(3);
            System.out.println("-----------------\n0: Rock\n1: Paper\n2: Scissor\n3: Exit");
            int playerInput = input.nextInt();

            if(playerInput == 3) break;

            String result = (playerInput == computerInput) ? "Draw" :
                    ((playerInput == 0 && computerInput == 2) ||
                            (playerInput == 1 && computerInput == 0) ||
                            (playerInput == 2 && computerInput == 1)) ? "WIN" : "Loss";

            System.out.println("Player: " + shapes[playerInput] + " Computer: " + shapes[computerInput] + " Which resulted in:");
            System.out.println(result);
        }
    }
}
