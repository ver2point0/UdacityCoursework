package lesson4fundamentaldatatypes.checkerboard;

// BlueJ project: lesson4/checkerboard
// Video: Checkerboard

public class CheckerBoardPainter
{
    /**
     * Computes the color of a square on a checkerboard.
     * The top left corner is blue.
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint
     */
    public int getColor(int row, int col)
    {
        if (row % 2 == 0 && col % 2 != 0) { // row is even && col is odd
            return 1; // return red
        } else if (row % 2 != 0 && col % 2 == 0) { // row is odd & col is even
            return 1; // return red
        } else if (row % 2 == 0 && col % 2 == 0) { // row && col are even
            return 0; // return blue
        } else // row && col are odd
            return 0; // return blue
    }
}

