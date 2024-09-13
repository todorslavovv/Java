
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(sc.nextLine());

            // If the user inputs 4, break the loop
            if (input == 4) {
                break;
            }
        }

        System.out.println("Program stopped, you entered 4.");
    }
}
