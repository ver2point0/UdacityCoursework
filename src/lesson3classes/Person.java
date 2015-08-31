package lesson3classes;

// BlueJ project: lesson3/friends3
public class Person
{
    private String name;
    private String friends;

    public Person (String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        Picture picture = new Picture(pictureName);
        picture.translate(xCoord, yCoord);
        picture.draw();
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
    }

    public void unFriend(Person nonFriend)
    {
        friends = friends.replace(" " + nonFriend.name, "");
    }
}

