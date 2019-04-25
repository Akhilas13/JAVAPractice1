import java.util.Scanner;
public class Palindrome
{
    public static void sum ()
    {
        int temporary, number, sum = 0, reverse = 0,remainder,x;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        temporary= number;//assign the number to a temporary variable
        while (number != 0) //reversing the number
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (temporary == reverse) //checks for palindrome
        {
            System.out.println("it is palindrome");
            do {
                x = temporary%10;
                if ((x%2) == 0)//checks for even
                {
                    sum=sum+x;//sum the even numbers
                }
                temporary= temporary/10;
            } while (temporary!=0);
            System.out.printf("%d",sum);

        }
        else//
            {
            System.out.println("it is not a palindrome");
            }
    }
    public static void main(String[] args)
    {
       sum();

    }
}
