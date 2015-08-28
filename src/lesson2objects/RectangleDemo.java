package lesson2objects;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        // making two boxes touch
        Rectangle box = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(80, 120, 20, 30);
        box.draw();
        box2.draw();
    }
}
