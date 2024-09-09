
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
int number = Integer.valueOf(sc.nextLine());
int seconds = number * 86400;
System.out.println(seconds);

    }
}
