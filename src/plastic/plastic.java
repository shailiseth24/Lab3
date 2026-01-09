import java.util.Scanner;
class plastic2D
{
    double length;
    double breadth;
    double getCost2D()
    {
        double area = length * breadth;
        return area * 40;
    }
}
class Plastic3D extends plastic2D
{
    double height;
    double getCost3D()
    {
        double volume = length * breadth * height;
        return volume * 60;
    }
}
public class plastic
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for 2D Sheet");
        System.out.println("Enter 2 for 3D Box");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            plastic2D sheet = new plastic2D();

            System.out.print("Enter length: ");
            sheet.length = sc.nextDouble();

            System.out.print("Enter breadth: ");
            sheet.breadth = sc.nextDouble();

            System.out.println("Cost of 2D Sheet = Rs " + sheet.getCost2D());
        }

        else if (choice == 2)
        {
            Plastic3D box = new Plastic3D();

            System.out.print("Enter length: ");
            box.length = sc.nextDouble();

            System.out.print("Enter breadth: ");
            box.breadth = sc.nextDouble();

            System.out.print("Enter height: ");
            box.height = sc.nextDouble();

            System.out.println("Cost of 3D Box = Rs " + box.getCost3D());
         }

        else
        {
            System.out.println("Invalid choice");
        }
    }
}

