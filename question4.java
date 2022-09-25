public class question4
{
    public static void main(String[] args)
    {
        int population=80000,i=0;
        double newpopulation=80000;
        while(newpopulation<=150000)
        {
            newpopulation= newpopulation+ (newpopulation*0.05);
            i=i+1;

        }
        System.out.println("The population will exceed after"+" "+ i+" "+"years");

    }

}