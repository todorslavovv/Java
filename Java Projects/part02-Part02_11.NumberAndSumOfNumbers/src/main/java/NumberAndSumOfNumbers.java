
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(sc.nextLine());

            if (num == 0) {
                System.out.println("Sum of the numbers: " + sum);
                System.out.println("Number of numbers: " + count);
                break;
            } else if (num != 0) {
                sum = sum + num;
                count = count + 1;
            }

        }
    }
}
