package lesson3classes;


public class PersonDemo
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara", "C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson3classes\\sara.jpg", 10, 200);
        Person chenghan = new Person("Cheng-Han", "C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson3classes\\cheng-han.png", 300, 0);
        Person cay = new Person("Cay", "C:\\Users\\PtJ\\UdacityCoursework\\src\\lesson3classes\\cay.gif", 250, 180);

        sara.addFriend(cay);
        sara.addFriend(chenghan);
    }
}

