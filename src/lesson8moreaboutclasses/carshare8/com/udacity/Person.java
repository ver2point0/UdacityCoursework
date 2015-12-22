package lesson8moreaboutclasses.carshare8.com.udacity;

public class Person
{
    private String name;
    private int destination;

    public Person(String name, int destination)
    {
        this.name = name;
        this.destination = destination;
    }

    public String getName()
    {
        return name;
    }

    public int getDestination()
    {
        return destination;
    }
}
