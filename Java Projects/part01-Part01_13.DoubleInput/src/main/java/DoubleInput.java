
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        double number = Double.valueOf(sc.nextLine());
        System.out.println("You gave the number " + number);
    
    }
}
