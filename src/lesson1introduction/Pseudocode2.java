package lesson1introduction;


public class Pseudocode2 {
    public static void main(String[] args) {
        // prints 10, 5, 16, 8, 4, 2 to the console
        int n = 10;
        while (n > 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
    }
}
