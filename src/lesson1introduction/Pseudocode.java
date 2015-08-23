package lesson1introduction;

public class Pseudocode {

    private static double item1 = 1.00;
    private static double item2 = 10.00;
    private static double cost = 0;

    public static void main(String[] args) {
        double tax1 = item1 * 0.08;
        double tip1 = item1 * 0.18;
        double tax2 = item2 * 0.08;
        double tip2 = item2 * 0.18;
        cost = item1 + item2 + tax1 + tax2 + tip1 + tip2;
        System.out.println(cost);


    }
}
