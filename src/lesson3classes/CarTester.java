package lesson3classes;

// Write a tester program that prints the actual and
// expected gas level after the given method calls.

public class CarTester
{
    public static void main(String[] args)
    {
        Car myCar = new Car(20);

        myCar.addGas(20);
        myCar.drive(100);
        System.out.println(myCar.getGasInTank());
        System.out.println("Expected: 15");
    }
}
