
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
