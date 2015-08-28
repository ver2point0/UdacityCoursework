package lesson2objects;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        // making two boxes touch
//        Rectangle box = new Rectangle(60, 90, 20, 30);
//        Rectangle box2 = new Rectangle(80, 120, 20, 30);
//        box.draw();
//        box2.draw();

        // Is translate() an accessor or mutator method
        // It's a mutator
        Rectangle box = new Rectangle(5, 10, 60, 90);
        System.out.println(box.getX());
        System.out.println(box.getWidth());
        box.translate(25, 40);
        System.out.println(box.getX());
        System.out.println(box.getWidth());

    }
}
