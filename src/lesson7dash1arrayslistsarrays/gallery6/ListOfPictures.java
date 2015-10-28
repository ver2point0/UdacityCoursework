package lesson7dash1arrayslistsarrays.gallery6;
// BlueJ project: lesson7/gallery6

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery6\\degas1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery6\\guigou1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery6\\gaugin1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery6\\monet1.jpg"));
        gallery.add(new Picture("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash1arrayslistsarrays\\gallery6\\seurat1.jpg"));

        // Your code here
        Picture tallest = gallery.get(0);
        for (int i = 1; i < gallery.size(); i++) {
            Picture pic = gallery.get(i);
            if (pic.getHeight() > tallest.getHeight()) {
                tallest = pic;
            }
        }
        // the enhanced for loop code works too, but it visits the first element
//        for (Picture pic : gallery) {
//            if (pic.getHeight() > tallest.getHeight()) {
//                tallest = pic;
//            }
//        }

        System.out.println("Tallest height: "
                           + tallest.getHeight());
        tallest.draw();
    }
}
