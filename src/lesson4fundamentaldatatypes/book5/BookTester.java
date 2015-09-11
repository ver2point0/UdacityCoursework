package lesson4fundamentaldatatypes.book5;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\book5\\aliceInWonderland.txt");

        System.out.println(alice.occurrencesOfAlice());
        System.out.println("Expected: 395");

        Book mary = new Book("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\book5\\mary.txt");

        System.out.println(mary.occurrencesOfAlice());
        System.out.println("Expected: 0");
    }
}
