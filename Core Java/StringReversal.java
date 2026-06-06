import java.util.*;
public class StringReversal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
            System.out.print(s.charAt(i));
        //String reversed = new StringBuilder(s).reverse().toString();
        //System.out.println("Reversed: " + reversed);
    }
    
}
