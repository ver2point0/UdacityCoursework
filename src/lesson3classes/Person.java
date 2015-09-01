package lesson3classes;

/**
 * Models a person who makes and unmakes friends
 *
 */
public class Person
{
    private String name;
    private String friends;
    private int x;
    private int y;

    public Person (String name, String pictureName, int x, int y)
    {
        this.name = name;
        friends = "";
        Picture picture = new Picture(pictureName);
        this.x = x;
        this.y = y;
        picture.translate(x, y);
        picture.draw();
    }

    public void makeMutualFriend(Person friend) {
        addFriend(friend);
        friend.addFriend(friend);
    }

    public void mutualUnfriend(Person nonFriend) {
        unFriend(nonFriend);
        nonFriend.unFriend(nonFriend);
    }
    public void addFriend(Person friend)
    {
        friends = friends + friend.name + " ";
        SmallCircle circle = new SmallCircle(x, y);
        circle.fill();
        Line line = new Line(x, y, friend.x, friend.y);
        line.draw();
    }

    public void unFriend(Person nonFriend)
    {
        friends = friends.replace(nonFriend.name + " ", "");
    }

    public String getFriends()
    {
        return friends;
    }

}


