
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(sc.nextLine());
        
        
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(sc.nextLine());
        
        int number3 = number1 * number2;
        
        
        
        System.out.println(number1 + " * " + number2 + " = " + number3);
        


    }
}
