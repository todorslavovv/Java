
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Write a message:");
        
           String message =sc.nextLine();
           
           System.out.println(message + "\n" + message + "\n" + message);
    }
}
