import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Last number? ");
        int input = Integer.valueOf(sc.nextLine());
        
        int sum = 0;

        for (int i = 0; i <= input; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum); // Print the result

        sc.close();
    }
}
