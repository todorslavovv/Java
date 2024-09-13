
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(sc.nextLine());

            if (num < 0) {
                System.out.println("Unsuitable number");
            } else if (num > 0) {
                System.out.println(num * num);
            } else {
                break;
            }
        }
    }
}
