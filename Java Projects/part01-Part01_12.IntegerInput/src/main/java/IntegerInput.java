
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(sc.nextLine());
        System.out.println("You gave the number " + number);
    }
}
