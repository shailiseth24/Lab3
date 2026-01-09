
class Apple
{
    void show()
    {
        System.out.println("This is Apple class");
    }
}
class Banana extends Apple
{
    void show()
    {
        System.out.println("This is Banana class");
    }
}
class Cherry extends Apple
{
    void show()
    {
        System.out.println("This is Cherry class");
    }
}
public class fruit
{
    public static void main(String[] args)
    {

        Apple obj;

        obj = new Apple();
        obj.show();

        obj = new Banana();
        obj.show();

        obj = new Cherry();
        obj.show();
    }
}

