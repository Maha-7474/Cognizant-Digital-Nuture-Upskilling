import java.util.*;
public class TryCatch_div0
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two intergers");
        int a=sc.nextInt();
        int b=sc.nextIn();
        try
        {
            int c=a/b;
            System.out.println("a/b="+c);
        }
        catch(ArthmeticException e)
        {
            System.out.println("division by zero is not possible");
        }
    }
}
