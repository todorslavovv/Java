import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = Integer.valueOf(sc.nextLine());
        int num2 = Integer.valueOf(sc.nextLine());
    
        int num3 = num1 + num2;
        
        double squareRoot = Math.sqrt(num3);
        
        System.out.println(squareRoot);
    }
}
