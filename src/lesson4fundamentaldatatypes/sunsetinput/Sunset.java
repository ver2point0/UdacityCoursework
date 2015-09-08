package lesson4fundamentaldatatypes.sunsetinput;

import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\sunsetinput\\queen-mary.png");
        Scanner addRedInput = new Scanner(System.in);

        System.out.print("Added redness: ");
        int userInput = addRedInput.nextInt();

        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(userInput);
            pic.setColorAt(i, c);
        }
    }
}
