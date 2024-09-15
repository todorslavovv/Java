
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers = Integer.valueOf(sc.nextLine());

        for (int i = numbers; i <= 100; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}