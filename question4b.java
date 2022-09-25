public class question4b
    {
        public static void main(String[] args)
        {
            double population=0.05,i=0;
            double newpopulation=80000;
            while(newpopulation<=150000)
            {
                newpopulation=(int)(newpopulation * (1+ population));
                i=i+1;

            }
            System.out.println("The population will exceed after"+" "+ i+" "+"years");

        }

    }
