package lesson7dash1arrayslistsarrays.gallery2;

// BlueJ project: lesson7/gallery2

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery2\\degas1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery2\\gaugin1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery2\\monet1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery2\\monet2.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery2\\renoir1.jpg"));

        for(int i = 1; i < gallery.size(); i++)
        {
            // Move pic 10 pixels to the right of left
            // Hint: left.getMaxX()
            Picture pic = gallery.get(i);
            Picture left = gallery.get(i - 1);
            pic.translate(left.getMaxX() + 10, 0);
        }

        for (int i = 0; i < gallery.size(); i++) {
            Picture pic = gallery.get(i);
            pic.draw();
        }
    }
}
