import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("This game involves guessing the correct number");
        System.out.println("Numbers are in range 0 - 10 ");
        System.out.println("Guess number that is going out next: ");

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(10) + 1;
            int attempts = 0;
            int guessedNumber = 0;

            while (guessedNumber != randomNumber) {
                //check input
                if (scanner.hasNextInt()) {
                    guessedNumber = scanner.nextInt();

                    if (guessedNumber < 1 || guessedNumber > 10) {
                        System.out.println("Please enter a number between 1 and 10.");
                        continue; //Skips rest of the loop and asks input again
                    }
                    attempts++;
                    if (guessedNumber == randomNumber) {
                        System.out.println("Correct!");
                    } else if (guessedNumber < randomNumber) {
                        System.out.println("Your guess is too low. Try again!");
                    } else {
                        System.out.println("Your guess is too high. Try again!");
                    }

                } else {
                    System.out.println("Invalid input. Please enter a number");
                    scanner.next();
                }
            }
            //offer to play again
            System.out.println("It took you " + attempts + "attempts.");
            System.out.println("Do you want to play again (y/n)? ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            } else if (response.equalsIgnoreCase("y")) {
                System.out.println("Input your guess: ");

            }


        }

        scanner.close();

    }
}

