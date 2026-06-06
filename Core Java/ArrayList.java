import java.util.*;

public class ArrayList 
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student names ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i<=n; i++)
        {
            System.out.print("Enter name " + i + ": ");
            String name = sc.nextLine();
            students.add(name);
        }
        System.out.println("\nStudent Names:");
        for (String name : students)
        {
            System.out.println(name);
        }
        sc.close();
    }
}