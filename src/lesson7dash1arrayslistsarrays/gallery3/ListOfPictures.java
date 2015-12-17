package lesson7dash1arrayslistsarrays.gallery3;

// BlueJ project: lesson7/gallery3

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        int rightMostX = 0;
        for (Picture pic : gallery)
        {
            // Move the first picture to offset 10,
            // the second picture ten pixels to the right of the first one,
            // and so on
            pic.translate(rightMostX + 10, 0);
            rightMostX = pic.getMaxX();
            pic.draw();
        }
    }
}
