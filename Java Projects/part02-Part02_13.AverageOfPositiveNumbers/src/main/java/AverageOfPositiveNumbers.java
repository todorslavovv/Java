
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(sc.nextLine());

            if (num == 0) {
                if (count > 0) {
                    System.out.println(average);
                    break;
                } else if (count < 1) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
            } else if (num > 0) {
                sum = sum + num;
                count = count + 1;
                average = (double) sum / count;

            }

        }
    }
}
