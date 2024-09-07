
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Give a string: ");
         String word = String.valueOf(sc.nextLine());
         
         System.out.println("Give an integer: ");
         int number = Integer.valueOf(sc.nextLine());
         
         System.out.println("Give a double: ");
         double floatingNumber = Double.valueOf(sc.nextLine());
         
         System.out.println("Give a boolean: ");
         boolean trueOrFalse = Boolean.valueOf(sc.nextLine());
         
         System.out.println("You gave the string " + word);
         System.out.println("You gave the integer " + number);
         System.out.println("You gave the double " + floatingNumber);
         System.out.println("You gave the boolean " + trueOrFalse);
    }
}
