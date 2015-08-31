package lesson3classes;

public class Person
{
    private String name;
    private String friends;
    private int x;
    private int y;

    public Person (String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        Picture picture = new Picture(pictureName);
        picture.translate(xCoord, yCoord);
        picture.draw();
        x = xCoord;
        y = yCoord;
    }

    // This function return the friends of this Person object
    // the function should return a String that contains all
    // the names of the friends of this Person object.
    public String getFriends()
    {
        return friends;
    }

    public void addFriend(Person friend)
    {
        friends = friends + " " + friend.name;
        SmallCircle circle = new SmallCircle(x, y);
        circle.fill();
        Line line = new Line(x, y, friend.x, friend.y);
        line.draw();
    }

    public void unFriend(Person nonFriend)
    {
        friends = friends.replace(" " + nonFriend.name, "");
    }
}

