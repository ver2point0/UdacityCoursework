package lesson4fundamentaldatatypes.book7;

public class BookTester
{
    public static void main(String[] args) 
    {
        Book alice = new Book("C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson4fundamentaldatatypes\\book7\\aliceInWonderland.txt");
        
        System.out.println("    Actual " + alice.getNumCharacters()); 
        System.out.println("    Expected 144331");
    }
}
