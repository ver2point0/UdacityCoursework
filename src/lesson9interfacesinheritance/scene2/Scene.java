package lesson9interfacesinheritance.scene2;// BlueJ project: lesson9/scene2

import java.util.ArrayList;

public class Scene
{
    public static void main(String[] args)
    {
        // Change to an ArrayList<Drawable>
        ArrayList<Drawable> sceneElements = new ArrayList<>();
        sceneElements.add(new Car(100, 300));
        sceneElements.add(new Car(250, 300));
        sceneElements.add(new Car(250, 350));
        sceneElements.add(new House(100, 150, 100, 100));
        sceneElements.add(new House(250, 100, 150, 150));
        sceneElements.add(new Dog(200, 100, "Fido.jpg"));
        sceneElements.add(new Dog(100, 400, "Rex.jpg"));
        sceneElements.add(new Dog(200, 400, "Lucky.jpg"));

        // Change to a single loop
        for (Drawable d : sceneElements) {
            d.draw();
        }
    }
}
