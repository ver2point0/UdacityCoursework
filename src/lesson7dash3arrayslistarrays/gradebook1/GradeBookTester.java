package lesson7dash3arrayslistarrays.gradebook1;

import java.util.Arrays;

public class GradeBookTester
{
    public static void main(String[] args)
    {
        GradeBook book = new GradeBook("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson7dash3arrayslistarrays\\gradebook1\\grades.txt");
        System.out.println(book.totalForStudent(0));
        System.out.println("Expected: 37.0");
        System.out.println(book.totalForStudent(21));
        System.out.println("Expected: 32.0");
        System.out.println(book.totalForStudent(22));
        System.out.println("Expected: -1");
    }
}
