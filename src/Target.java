import java.util.Scanner;
public class Target
{
    public static void guesses()
    {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the original number");
        int original = s.nextInt();
        System.out.println("Enter the limit");
        int a=s.nextInt();

        for (i= 1;i <= a;i++)
        {
            System.out.println("Enter the guess");
            int guessed = s.nextInt();
            if (guessed == original)//checks guessed number equals original number
            {
                System.out.println("correct guess");
                break;

            }
            else
                {
                System.out.println("wrong guess");
            }
        }
    }
    public static void main(String[] args)
    {
        guesses();
    }

}





