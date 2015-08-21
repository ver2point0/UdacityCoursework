package lesson1introduction;


public class Errors {
    public static void main(String[] args) {
        /**
         *  compile-time or syntax error
         *  ouch symbol cannot be found
         * */
        // System.ouch.println("Hello, World!");

        // run-time error or logic error
        // "Word" should be "World"
        System.out.println("Hello, Word!");

        // throws java.lang.ArithmeticException error
        // run-time error
        // cannot divide by 0
        //System.out.println(1 / 0);
    }
}
