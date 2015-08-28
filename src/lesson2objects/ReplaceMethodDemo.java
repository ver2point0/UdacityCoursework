package lesson2objects;

// working with the replace method
// replacing "i"s with "x"s
public class ReplaceMethodDemo {

    public static void main(String[] args) {
        String river = "Mississippi";
        String newRiver;
        System.out.println("The current river is: " + river);
        newRiver = river.replace("i", "x");
        System.out.println("After replacing the 'i's with 'x's : " + newRiver);
    }
}
