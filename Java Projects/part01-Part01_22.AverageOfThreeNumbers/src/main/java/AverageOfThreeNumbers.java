
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(sc.nextLine());
        
        
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(sc.nextLine());
        
        System.out.println("Give the third number:");
        int number3 = Integer.valueOf(sc.nextLine());
        
        double average = ((double) number1 + number2 + number3) / 3;

        
        
        System.out.println("The average is " + average);
        
        
    }
}
