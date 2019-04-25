import java.util.Scanner;
public class Loop
{
    public static void pattern()
    {
        int i,j;
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (i = 1; i <= number; i++)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print(i);
            }

        }
    }
    public static void main(String[] args)
    {
        pattern();
        }
}

