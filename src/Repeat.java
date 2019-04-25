import java.util.Scanner;
public class Repeat
{
    public static void repeats()
    {
        int i;
        String endword="";
        System.out.println("Enter the inputs");
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        int number=input.nextInt();
        int totalLength=word.length();//total length of the input
        int length=totalLength-number;
        for(i=length;i<=totalLength-1;i++)
        {
            endword=endword+word.charAt(i);//the word which needs to repeat
        }
        System.out.print(word);
        for(i=0;i<number;i++)
        {
            System.out.print(endword);
        }
    }
    public static void main(String[] args)
    {
       repeats();
    }
}
