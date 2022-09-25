import java.util.Scanner;
public class question1
{
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a Number");

        double a= myobj.nextDouble();
        if (a >= 80 && a <= 90)
        {
            a = a + 5;
            System.out.println(a);
        }
        else
        {
            System.out.println(a);
        }
    }
}
