
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.valueOf(sc.nextLine());
        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println("Number " + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }
        

    }
}
