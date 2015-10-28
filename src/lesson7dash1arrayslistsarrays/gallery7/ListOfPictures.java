package lesson7dash1arrayslistsarrays.gallery7;// BlueJ project: lesson7/gallery7

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery7\\degas1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery7\\gaugin1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery7\\monet1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery7\\monet2.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery7\\renoir1.jpg"));

        // Your code here
        int count = 0;
        for (Picture pic : gallery) {
            if (pic.getHeight() > pic.getWidth()) { // portrait orientation
                count++;
            }
        }
        System.out.println("Pictures with portrait orientation: " + count);
    }
}
