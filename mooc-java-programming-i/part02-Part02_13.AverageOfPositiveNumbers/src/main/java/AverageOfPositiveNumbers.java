
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0, sum = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input > 0) {
                num += 1;
                sum += input;
            }
        }
        if (num > 0) {
            System.out.println((double)sum / num);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
