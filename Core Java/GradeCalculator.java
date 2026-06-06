import java.util.Scanner;
public class GradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        char grade;
        if (m >= 90) grade = 'A';
        else if (m >= 80) grade = 'B';
        else if (m >= 70) grade = 'C';
        else if (m >= 60) grade = 'D';
        else grade = 'F';
        System.out.println("Marks:"+m+" Grade:"+grade);
    }
}
