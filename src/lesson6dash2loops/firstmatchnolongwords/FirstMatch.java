package lesson6dash2loops.firstmatchnolongwords;

// Write a program that finds the first word in Alice In Wonderland
// that is longer than 60 characters, and if there are no words
// that long, prints "There are no long words".

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson6dash2loops\\firstmatchnolongwords\\aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;

        final int THRESHOLD = 60;

        while (in.hasNext() && !found) {
            String word = in.next();
            if (word.length() > THRESHOLD) {
                longWord = word;
                found = true;
            }
        }
        // if there are no long words, print
        // "There are no long words"
        // instead of
        // "The first long word is: " ...
        if (longWord.equals("")) {
            System.out.println("There are no long words");
        } else {
            System.out.println("The first long word is: " + longWord);
        }
    }
}
