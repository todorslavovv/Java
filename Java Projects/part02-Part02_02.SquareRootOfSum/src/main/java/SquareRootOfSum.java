import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers from the user
        System.out.println("Enter the first number:");
        int firstNumber = Integer.valueOf(sc.nextLine());

        System.out.println("Enter the second number:");
        int secondNumber = Integer.valueOf(sc.nextLine());

        // Calculate the sum
        int sum = firstNumber + secondNumber;

        // Check if the sum is non-negative
        if (sum < 0) {
            System.out.println("The sum is negative. Cannot calculate square root.");
        } else {
            // Calculate the square root
            double squareRoot = Math.sqrt(sum);
            System.out.println((int)squareRoot); // Cast to int for whole number output as in examples
        }

        sc.close();
    }
}
