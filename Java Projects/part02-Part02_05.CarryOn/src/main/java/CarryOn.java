
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");

            String carryOn = sc.nextLine();

            if (carryOn.equals("no")) {
                break;
            }
        }

    }
}
