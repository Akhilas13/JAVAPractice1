
import java.util.Scanner;
public class Capital
{
    public static void letter()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character");
        String input=s.nextLine();
        char ch=input.charAt(0);
        if(Character.isUpperCase(ch))//checking for  uppercase letters
        {
            System.out.println("uppercase");
        }
        else if(Character.isLowerCase(ch))//checking for  lowercase letters
        {
            System.out.println("lowercase");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("digit");//checking for digits
        }
        else{
            System.out.println("special symbol");//checking for special symbols
        }
    }
    public static void main(String[] args)
    {
        letter();

    }

}
