package lesson5dash2decisions.sierraflag;

public class Flag
{
    private Picture pic;
    private int width;
    private int height;


    public Color getColorAt(int x, int y)
    {
        // Write the if/else statement to determine if a pixel should be blue or white.
        Color c;
        if (x >= width / 3 && x < width * 2 / 3
                && y >= height / 3 && y < height * 2 / 3) {
            c = Color.BLUE;
        } else {
            c = Color.WHITE;
        }
        return c;
    }

    public Flag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }

    public static void main(String[] args) {
        Flag flag = new Flag(300, 300);
        flag.getColorAt(0, 0);
    }
}
