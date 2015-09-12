package lesson4fundamentaldatatypes.fields;

public class FieldCalculator
{
    int radius = 400;
    int diameter = 2 * radius;
    
    /**
     * Calculates the number of circular fields of Radius 400 meters
     * that can fit on a plot
     * of land if the first row starts all the way at the left, and
     * the second row starts one radius away from the left edge as
     * described in the question video, and the circles are as close
     * together as they can be without overlapping.
     */
    public int getNumberOfFields(int width, int length)
    {
        // YOUR CODE HERE
        // Use the equations from the last few questions
        // and the mathematical operations you've learned in this lesson
        // You've done an example by hand. Now code it up!
        int totalNumberRows = (int) ((length - diameter) / (radius * Math.sqrt(3))) + 1;
        int totalOddRows = (totalNumberRows + 1) / 2 ;
        int totalEvenRows = (totalNumberRows / 2);
        int columnsPerOddRow = (width / diameter);
        int columnsPerEvenRow = (width - radius) / diameter;
        int numberCircularFields = (totalOddRows * columnsPerOddRow) + (totalEvenRows * columnsPerEvenRow);
        return numberCircularFields;
    }
}
