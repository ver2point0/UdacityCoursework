package lesson6dash2loops.chevalierdemere;

// Simulates 24 random dice rolls.
// Each roll has two dice.
// Prints "He won" if any roll contained double sixes.
// Prints "He lost" otherwise.

import java.util.Random;

public class TwoDiceTwentyFourTimes {
    public static void main(String[] args) {
        Random generator = new Random();
        // YOUR CODE HERE
        // Write a loop to simulate 24 dice rolls.
        // Track whether the Chevalier de Meré wins or not
        for (int i = 0; i < 24; i++) {
            int firstRoll = generator.nextInt(6) + 1;
            int secondRoll = generator.nextInt(6) + 1;
            if(firstRoll == 6 && secondRoll == 6) {
                System.out.println("He won!");
            }
            else {
                System.out.println("He lost");
            }
        }
    }
}


