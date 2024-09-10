
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.valueOf(sc.nextLine());

        if (number >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

    }
}
