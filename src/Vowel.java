import java.util.Scanner;
public class Vowel {
    public static void main(String[] args)
    {
        letter();
    }

    public static void letter()
    {
        int i;
        System.out.println("enter the word");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();
        for (i = 0; i < len; i++)
        {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') //checks for vowels
            {
                System.out.print("vowel ");

            }
            else if (Character.isDigit(ch))//error message for digits
            {
                System.out.print("error ");

            }
            else
                {
                System.out.print("consonant ");

            }
        }
    }
}




