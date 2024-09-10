
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = Integer.valueOf(sc.nextLine());
        System.out.println("Give speed:");
        if (number > 120) {
                System.out.println("Speeding ticket!");
            }
    
    
    }
}