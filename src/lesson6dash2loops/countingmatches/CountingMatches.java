package lesson6dash2loops.countingmatches;

import java.util.Scanner;
public class CountingMatches
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int counter = 0;

        // Prompt the user for a value until they enter Q
        // count how many times the user enters a negative number
        // using the variable counter
        System.out.print("Enter a value, Q to quit: ");
        while(in.hasNextDouble()) {
            double value = in.nextDouble();
            if(value < 0) {
                counter++;
            }
            System.out.print("Enter a value, Q to quit: ");
        }
        System.out.println("The water line fell on " + counter + " years.");
    }
}
