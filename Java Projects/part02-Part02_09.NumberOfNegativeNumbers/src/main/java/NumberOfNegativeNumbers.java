
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(sc.nextLine());

            if (num == 0) {
                System.out.println("Number of negative numbers: " + (count));
                break;
            } else if (num < 0) {
                count = count + 1;
            }

        }
    }
}
