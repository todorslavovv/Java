
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                Scanner sc = new Scanner(System.in);


        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(sc.nextLine());
        
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(sc.nextLine());
        
        int sum = number1 + number2;
        int difference = number1 - number2;
        int multiplication = number1 * number2;
        double diversion = (double) number1 / number2;
       
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " / " + number2 + " = " + diversion);
        
        
    }
}
