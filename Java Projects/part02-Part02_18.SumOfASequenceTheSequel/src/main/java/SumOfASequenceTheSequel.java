
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number? ");
        int first = Integer.parseInt(sc.nextLine());

        System.out.println("Second number? ");
        int second = Integer.parseInt(sc.nextLine());

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        int sum = 0;
        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

        sc.close();
    }
}
