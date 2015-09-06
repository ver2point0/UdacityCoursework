package lesson4fundamentaldatatypes.grayscale;

public class GrayScale
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\grayscale\\eliza.jpg");
        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.turnGray();
            pic.setColorAt(i, c);
        }
    }
}

