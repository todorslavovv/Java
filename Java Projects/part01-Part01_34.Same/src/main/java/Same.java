
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String string1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String string2 = sc.nextLine();

        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
