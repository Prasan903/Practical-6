public class Prac_3
{
    public static void main(String[] args)
    {
        try {
            for(int count=1;count<=10;count++)
            {
                System.out.println(count);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {

        }
        //Prepared by 21CE121_Prasan
    }
}