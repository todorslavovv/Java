
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(sc.nextLine());

        if (age >= 0 && age <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }
    }
}
