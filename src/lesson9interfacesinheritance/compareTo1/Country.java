package lesson9interfacesinheritance.compareTo1;// Implement compareTo
/**
   A country with a name and area.
*/
public class Country implements Measurable, Comparable
{
    private String name;
    private double area;

    /**
       Constructs a country.
       @param aName the name of the country
       @param anArea the area of the country
    */
    public Country(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    public int compareTo(Object otherObject)
    {
        Country otherCountry = (Country) otherObject;
        if (this.equals(otherCountry))
        {
            return 0;
        }
        else if (this.area < otherCountry.area)
        {
            return -1;
        }
        else if (this.area > otherCountry.area)
        {
            return 1;
        }
        else
        {
            return this.name.compareTo(otherCountry.name);
        }
    }

    /**
       Gets the country name.
       @return the name
    */
    public String getName()
    {
        return name;
    }

    /**
       Gets the area of the country.
       @return the area
    */
    public double getArea()
    {
        return area;
    }

    /**
       Gets the area of the country.
       @return the area
    */
    public double getMeasure()
    {
        return area;
    }

    public boolean equals(Object other)
    {
        if (other instanceof Country)
        {
            Country country = (Country) other;
            return this.name.equals(country.name)
                   && this.area == country.area;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Country[name=" + name + " area=" + area + "]\n";
    }
}
