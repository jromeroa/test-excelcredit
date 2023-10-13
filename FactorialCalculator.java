import java.util.Scanner;

public class FactorialCalculator {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to calculate its factorial: ");
        int number = scanner.nextInt();
        long result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();
    } 

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}