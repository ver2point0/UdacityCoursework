package lesson2objects;


public class ReplaceMethodDemo {

    public static void main(String[] args) {
        // working with the replace method
        // replacing "i"s with "x"s
//        String river = "Mississippi";
//        String newRiver;
//        System.out.println("The current river is: " + river);
//        newRiver = river.replace("i", "x");
//        System.out.println("After replacing the 'i's with 'x's : " + newRiver);

        // Is replace an accessor or mutator method?
        // It's an accessor method
        String greeting = "Hello";
        System.out.println(greeting.replace("H", "J"));
        System.out.println(greeting);
    }
}
