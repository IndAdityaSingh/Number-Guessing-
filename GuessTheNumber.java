import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Create Scanner and Random objects to use in the program
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a secret random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        
        // Declare variables to track the game's state
        int userGuess = 0;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // This is the main game loop. It continues until the user wins.
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt(); // Read the user's number
            numberOfTries++; // Increment the try counter

            // Check if the guess is too low
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            
            // Check if the guess is too high
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            
            // If it's not too low or too high, it must be correct
            } else {
                hasGuessedCorrectly = true; // Set the flag to true to end the loop
                System.out.println("Congratulations! You've guessed the number!");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}