
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.valueOf(sc.nextLine());
        int second = Integer.valueOf(sc.nextLine());

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }

    }
}
