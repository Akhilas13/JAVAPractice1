import java.util.Scanner;
public class Exist
{
    public static void name()
    {
        int number;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        number=input.nextInt();
        if((number%2==0)&&(number>20)&&(number<30))//checks number is even and exists between 20 and 30
        {
            System.out.println("Jerry");
        }
        else if((number%2!=0)&(number>20)&&(number<30))//checks number is odd and exists between 20 and 30
        {
            System.out.println("Tom");
        }
        else
            {
            System.out.println("error");
             }
    }
    public static void main(String[] args)
    {
        name();
    }
}
