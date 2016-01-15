package lesson9interfacesinheritance.measure1;

// BlueJ project: lesson9/measure1
public class Data
{
    /**
       Computes the average area of the given countries.
       @param objects an array of Country objects
       @return the average of the areas
    */
    public static double average(Country[] objects) {
        // Compute the average area
        double sum = 0;
        for (Country obj : objects) {
            sum += obj.getArea();
        }
        return sum / objects.length;
    }
}
