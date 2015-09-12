package lesson4fundamentaldatatypes.fields;

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // Using the formulas that Sara developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
        int diameter = 2 * radius;
        int totalNumberRows = (int) ((length - diameter) / (radius * Math.sqrt(3))) + 1;
        int totalOddRows = (totalNumberRows + 1) / 2 ;
        int totalEvenRows = (totalNumberRows / 2);
        int columnsPerOddRow = (width / diameter);
        int columnsPerEvenRow = (width - radius) / diameter;
        int numberCircularFields = (totalOddRows * columnsPerOddRow) + (totalEvenRows * columnsPerEvenRow);
        return numberCircularFields;
    }
}
