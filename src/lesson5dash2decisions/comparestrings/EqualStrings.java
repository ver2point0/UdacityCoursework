package lesson5dash2decisions.comparestrings;

public class EqualStrings
{
    public static void main(String[] args)
    {
        String first = "Uda";
        String second = "city";
        String firstAndSecond = first + second;
        String third = "Udacity";
        // use the equals() method to test if the strings are the same
        if (firstAndSecond.equals(third))
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("firstAndSecond is " + firstAndSecond);
        }
    }
}
