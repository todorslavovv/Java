
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers = Integer.valueOf(sc.nextLine());

        for (int i = 0; i <= numbers; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
