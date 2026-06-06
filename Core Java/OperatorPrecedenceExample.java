public class OperatorPrecedenceExample 
{
    public static void main(String[] args) 
    {
        int exp = 10+5*2-4/2%3;
        System.out.println("Result: " + exp);
        System.out.println("Order of operations:Multiplication before Division then Modulus next Addition and Subtraction");
    }
}
