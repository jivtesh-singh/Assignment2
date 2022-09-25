
import java.util.Scanner;

public class question3
{
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter the Month Index");
        int index= myobj.nextInt();
        System.out.println("Enter Year");
        int year= myobj.nextInt();
        int days=0;
        String month="";
        switch (index)
        {
            case 1:
                month= "January";
                days=31;
                break;
            case 2:
                month="February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                {
                    days=29;

                }
                else
                {
                    days=28;
                }
                break;
            case 3:
                month = "March";
                days = 31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "July";
                days = 31;
                break;
            case 8:
                month = "August";
                days = 31;
                break;
            case 9:
                month = "September";
                days = 30;
                break;
            case 10:
                month = "October";
                days = 31;
                break;
            case 11:
                month = "November";
                days = 30;
                break;
            case 12:
                month = "December";
                days = 31;
                break;

            default:
                System.out.println("Enter a valid Month");
                break;
        }
        System.out.println("The month is"+" "+month+" "+" and the number of days are"+" "+days);



    }

}
