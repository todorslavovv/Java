
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(sc.nextLine());

            count = count + 1;
            if (num == 0) {
                System.out.println("Number of numbers: " + (count - 1));
                break;
            }

        }
    }
}
