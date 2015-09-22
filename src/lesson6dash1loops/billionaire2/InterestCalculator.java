package lesson6dash1loops.billionaire2;

// Change the Program so that it will calculate the number of years
// to reach 1 million dollars when the interest rate is 10%
public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        double rate = 0.10;
        double target = 1000000;
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
