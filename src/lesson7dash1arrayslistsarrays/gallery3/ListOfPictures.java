package lesson7dash1arrayslistsarrays.gallery3;

// BlueJ project: lesson7/gallery3

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery3\\degas1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery3\\gaugin1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery3\\monet1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery3\\monet2.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery3\\renoir1.jpg"));

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
