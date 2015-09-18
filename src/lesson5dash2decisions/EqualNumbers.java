package lesson5dash2decisions;

public class EqualNumbers {
    public static void main(String[] args) {
        // When comparing two decimal numbers, compare whether they are close
        // enough to each other, not if they are exactly the same

        double original = 2;
        double root = Math.sqrt(original);
        double rootSquared = root * root;
        final double EPSILON = 1E-12;

        if (Math.abs(rootSquared - original) < EPSILON) {
            System.out.println("They are the same");
        } else {
            System.out.println("rootSquared is " + rootSquared);
        }
    }
}
