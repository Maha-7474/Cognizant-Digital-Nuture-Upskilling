import java.util.*;
public class PalindromeChecker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
}
