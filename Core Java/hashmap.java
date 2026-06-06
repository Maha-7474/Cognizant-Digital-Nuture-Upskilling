import java.util.*;
public class hashmap 
{
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of entries:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) 
        {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            students.put(id, name);
        }
        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();
        if (students.containsKey(searchId)) 
        {
            System.out.println("Student Name: " + students.get(searchId));
        } 
        else 
        {
            System.out.println("Student ID not found.");
        }
        sc.close();
    }
}