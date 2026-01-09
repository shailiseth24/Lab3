import java.util.Scanner;
class Plate
{
    double length, width;

    Plate(double l, double w)
    {
        length = l;
        width = w;
        System.out.println("Plate constructor called");
    }
}

class Box extends Plate
{
    double height;

    Box(double l, double w, double h)
    {
        super(l, w);
        height = h;
        System.out.println("Box constructor called");
    }
}
class WoodBox extends Box
{
    double thick;

    WoodBox(double l, double w, double h, double t)
    {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox constructor called");
    }

    void display()
    {
        System.out.println("\nLength: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Thickness: " + thick);
    }
}
public class boxplate
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);
        wb.display();
    }
}
