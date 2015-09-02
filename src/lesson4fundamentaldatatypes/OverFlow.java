package lesson4fundamentaldatatypes;

public class OverFlow {
    public static void main(String[] args) {

        // prints the result of multiplying 1 million * 1 million as an int
        // The answer should be 1 trillion, but it has a limit of
        // ~2.14 billion
        int oneMillionInt = 1000000;
        int mysteryInt = oneMillionInt * oneMillionInt;
        System.out.println(mysteryInt);

        // prints the result of multiplying 1 million * 1 million as a double
        double oneMillionDouble = 1000000.0;
        double mysteryDouble = oneMillionDouble * oneMillionDouble;
        System.out.println(mysteryDouble);

        // exercise in precision
        // answer should be 435
        // computer prints 434.99999999999994 because it works in binary # system
        // no exact presentation for 4.35
        double unitPrice = 4.35;
        double totalPrice = 100 * unitPrice;
        System.out.println(totalPrice);
    }
}
