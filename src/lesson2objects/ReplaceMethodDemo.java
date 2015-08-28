package lesson2objects;

// working with the replace method
// replacing "i"s with "x"s
public class ReplaceMethodDemo {
    private static String river = "Mississippi";
    private static String newRiver;
    public static void main(String[] args) {
        System.out.println("The current river is: " + river);
        newRiver = river.replace('i', 'x');
        System.out.println("After replacing the 'i's with 'x's : " + newRiver);
    }
}
