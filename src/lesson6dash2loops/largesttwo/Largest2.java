package lesson6dash2loops.largesttwo;

// Read in the values from the file input.txt, stopping
// at the end of the file (or if the file contains
// an input that is not a number). Print out the largest
// value that you read.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Largest2
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        String file = "input.txt";
        File inputFile = new File(file);
        Scanner in = new Scanner(inputFile);

        double largest = in.nextDouble();
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input > largest)
            {
                largest = input;
            }
        }
        System.out.println("Largest value: " + largest);
    }
}
