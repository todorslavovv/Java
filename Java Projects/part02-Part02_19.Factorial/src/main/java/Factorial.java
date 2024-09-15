
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Last number? ");
        int lastNum = Integer.valueOf(sc.nextLine());

        int result = 1;

        for (int i = 1; i <= lastNum; i++) {
            result = result * i;
        }

        System.out.println("The factorial is " + result);

        sc.close();
    }
}
