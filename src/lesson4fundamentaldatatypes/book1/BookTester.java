package lesson4fundamentaldatatypes.book1;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\book1\\aliceInWonderland.txt");

        System.out.println(alice.getNumCharacters());
        System.out.println("Expected: 144331");

        Book mary = new Book("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\book1\\mary.txt");
        System.out.println(mary.getNumCharacters());
        System.out.println("Expected: 475");
    }
}
