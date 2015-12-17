package lesson6dash1loops.dim;

public class Dim
{
    public static void main(String[] args)
    {
        Picture mary = new Picture("queen-mary.png");
        mary.draw();
        // iterate over the pixels in the image turning every 5th one to Color.BLACK
        for (int i = 0; i < mary.pixels(); i += 5) {
            mary.setColorAt(i, Color.BLACK);
        }
    }
}
