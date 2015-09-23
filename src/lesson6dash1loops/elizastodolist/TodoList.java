package lesson6dash1loops.elizastodolist;

// Actually, Elizas list should look like this:
// 1. Eat
// 2. Sleep
// 3. Eat
// 4. Sleep
// 5. Eat
// 6. Sleep
// Change the code inside the for loop to print out this list
public class TodoList
{
    public static void main(String[] args)
    {
        for (int counter = 1; counter <= 6; counter++)
        {
            if (counter % 2 == 1) {
                System.out.println(counter + ". Eat");
            } else {
                System.out.println(counter + ". Sleep");
            }
        }
    }
}

