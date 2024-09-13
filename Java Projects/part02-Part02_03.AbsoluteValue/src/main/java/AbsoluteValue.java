
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.valueOf(sc.nextLine());

        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }

    }
}
