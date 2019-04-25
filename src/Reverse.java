import java.util.Scanner;
public class Reverse
{
    public static void reverses()
    {
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=input.nextLine();
        int length=str.length();//length of string
        String reverse="";//empty string
        for(i=length-1;i>=0;i--)//reverses the string
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);

    }
    public static void main(String[] args)
    {
      reverses();

        }
}



