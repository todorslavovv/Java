
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(sc.nextLine());
        

        if (number < 2015) {
            System.out.println("Ancient history!");
        }

    }
}