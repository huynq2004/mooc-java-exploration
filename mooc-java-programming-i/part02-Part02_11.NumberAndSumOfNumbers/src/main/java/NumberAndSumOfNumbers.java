
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0, sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                num += 1;
                sum += input;
            }
        }
        System.out.println("Number of numbers: " + num);
        System.out.println("Sum of the numbers: " + sum);
    }
}
