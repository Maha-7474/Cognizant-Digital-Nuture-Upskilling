import java.util.*;
public class CustomException
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        try
        {
            if(age<18)
            {
                throw new InvalidAgeException("age should be greater than 18");
            }
            else
            {
                System.out.println("can vote");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
