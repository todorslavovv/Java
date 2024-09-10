
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int firstNumber = Integer.valueOf(sc.nextLine());
        

        System.out.println("Enter the second integer: ");
        int secondNumber = Integer.valueOf(sc.nextLine());

        if (firstNumber > secondNumber) {
            System.out.println("The larger number is: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("The larger number is: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
