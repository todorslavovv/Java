
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Where to? ");
        int numbers = Integer.valueOf(sc.nextLine());
        System.out.println("Where from? ");
        int from = Integer.valueOf(sc.nextLine());

        for (int i = from; i <= numbers; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}