import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate a random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the user guesses the correct number
        while (userGuess != randomNumber) {
            // Prompt the user to input their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            // Compare the user's guess to the generated number
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number: " + randomNumber);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
