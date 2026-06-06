import java.util.*;
public class NumberGuess
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess;
        do
        {
            System.out.print("Guess the number: ");
            userGuess = sc.nextInt();
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again");
            } else {
                System.out.println("Congratulations! You guessed the number");
            }
        } 
        while (userGuess != numberToGuess);
    }
}
