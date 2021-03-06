package lesson4fundamentaldatatypes.book2;

// Mad Hatter search
public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");

        System.out.println(alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1"); // returns -1 if no results, called "The Hatter" in the book

        Book code = new Book("BookTester.java");
        System.out.println(code.firstOccurrenceOfMadHatter());
        System.out.println("Expected: 3");
    }
}
