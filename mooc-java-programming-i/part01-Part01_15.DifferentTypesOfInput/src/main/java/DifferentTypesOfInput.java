
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double fnum = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean tOrf = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + text + "\n" +
                           "You gave the integer " + integer + "\n" +
                           "You gave the double " +fnum + "\n" +
                           "You gave the boolean " +tOrf);
       
    }
}
