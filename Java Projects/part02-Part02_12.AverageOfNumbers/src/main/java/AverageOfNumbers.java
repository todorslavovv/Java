import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            count = count + 1;
            average = average + number;
            if (number == 0) {
                count = count - 1;
                System.out.println("Average of the numbers: " +(double)(average / count));
                break;
            }

        }
    }
}