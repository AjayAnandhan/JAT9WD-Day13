package Task11;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int denominator = scanner.nextInt();
        
        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        scanner.close();
    }
    
    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
    
}
