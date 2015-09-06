package lesson4fundamentaldatatypes.mathinjava;

public class MathInJava
{
    /*
       Computes the fraction
           y
       --------
       x(1 + x)
    */
    public double uglyFraction(double x, double y)
    {
        return y / (x * (1 + x));
    }

    /*
        Computes the fraction
        2 + x(3x - 4)
        -------------
          (x+2)(x)
    */
    public double uglierFraction(double x)
    {
        return (2 + x * (3 * x - 4)) / ((x + 2) * x);
    }

    /**
     Computes the average of four values.
     @param a the first value
     @param b the second value
     @param c the third value
     @param d the average of a, b, c, and d
     */
    public double average(double a, double b, double c, double d)
    {
        return ((a + b + c + d) / 4.0);
    }
}

