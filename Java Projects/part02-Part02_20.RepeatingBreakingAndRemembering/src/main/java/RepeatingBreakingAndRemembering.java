
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give numbers:");
        int number = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            number = Integer.valueOf(sc.nextLine());

            count = count + 1;

            if (number == -1) {
                count = count - 1;
                break;
            } else if (number != -1) {
                if (number % 2 == 0) {
                    even = even + 1;
                } else if (number % 2 != 0) {
                    odd = odd + 1;
                }
            }

            sum = sum + number;
        }

        double average = (double) sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}
