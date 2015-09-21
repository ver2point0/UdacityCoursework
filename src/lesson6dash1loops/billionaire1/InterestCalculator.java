package lesson6dash1loops.billionaire1;

// Bluej project: lesson6/billionaire1
// Change the program so that it will calculate the number of years
// to reach 1 billion dollars instead of 1 million.

public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        double target = 1000000000;
        double rate = 0.01;
        int year = 0;

        while (balance < target)
        {
            double interest = balance * rate;
            balance += interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}
