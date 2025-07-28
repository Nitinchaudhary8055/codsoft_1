import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int target = rand.nextInt(100) + 1;
            int guess = 0;

            System.out.println("Guess a number between 1 and 100.");

            while (guess != target) {
                System.out.print("Enter guess: ");
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    if (guess < target) {
                        System.out.println("Too low.");
                    } else if (guess > target) {
                        System.out.println("Too high.");
                    } else {
                        System.out.println("Correct!");
                    }
                } else {
                    System.out.println("Invalid input.");
                    scanner.next();
                }
            }

            scanner.nextLine(); // clear buffer
            System.out.print("Play again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Game over.");
        scanner.close();
    }
}
    

