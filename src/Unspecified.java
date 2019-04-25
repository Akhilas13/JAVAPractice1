import java.util.Scanner;
public class Unspecified
{
    public static void  sum()
    {
        int number,total=0;
        System.out.println("enter the numbers");
        Scanner input=new Scanner(System.in);
        while((number=input.nextInt())!=0)//reading for unspecified number of integers
        {
            if(number>=0)
            {
                total = total + number;
            }
            else
                {
                System.out.println("error");//error message for non-integer values
                }
        }
        System.out.println(total);
    }
    public static void main(String[] args)
    {
       sum();
    }
}
