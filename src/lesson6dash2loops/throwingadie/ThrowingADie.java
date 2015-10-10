package lesson6dash2loops.throwingadie;
// A program that simulates tossing a die 100 times.
// It prints the number of times you roll a 6. 
import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        int SEED = 42;
        int DIE_ROLLS = 100;
        int SIDES = 6;
        int count = 0;
        Random generator = new Random(SEED);
        // YOUR CODE HERE
        // Write a loop that simulates 100 die rolls. 
        // generate 100 random ints using generator. 
        // the ints should have values 1,2,3,4,5, or 6
        // Print the number of 6s rolled.
        for(int i = 0; i < DIE_ROLLS; i++) {
            int values = 1 + generator.nextInt(SIDES);
            if (values % SIDES == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " 6s");
    }
}
