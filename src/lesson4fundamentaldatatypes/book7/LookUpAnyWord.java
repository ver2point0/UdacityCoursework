package lesson4fundamentaldatatypes.book7;

import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        // Create an scanner object to read the user input
        Scanner userInput = new Scanner(System.in);
        // Read a word from the scanner and assign it to a String variable named word
        String word = userInput.nextLine();
        // Create a book object that reads from aliceInWonderland.txt
        Book book = new Book("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\book7\\aliceInWonderland.txt");

        // Find the number of occurrences of that word and assign it to a variable named occurrences
        int occurs = book.occurrencesOf(word);
        System.out.println(word + " occurs " + occurs + " times!");
    }
}
