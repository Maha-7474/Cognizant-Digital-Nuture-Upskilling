import java.util.*;
public class FactorailCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative factorial: ");
        int n = sc.nextInt();
        long r = 1;
        for (int i=1; i<=n; i++) {
            r*=i;
        }
        System.out.println("Factorial of " + n + " is: " + r);
    }
}
