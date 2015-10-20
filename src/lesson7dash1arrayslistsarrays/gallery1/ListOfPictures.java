package lesson7dash1arrayslistsarrays.gallery1;

// BlueJ project: lesson7/gallery1

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery1\\degas1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery1\\gaugin1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery1\\monet1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery1\\monet2.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery1\\renoir1.jpg"));

        for (int i = 0; i < gallery.size(); i++)
        {
            Picture pic = gallery.get(i);
            pic.translate(100 * i, 0);
            pic.draw();
        }
    }
}
