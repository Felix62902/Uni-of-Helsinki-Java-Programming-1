
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here                
        System.out.println("Give the first number:");
        int one = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int two = Integer.valueOf(scanner.nextLine());
        System.out.println(one+ " + " + two + " = " + (one+two));
        System.out.println(one+ " - " + two + " = " + (one-two));
        System.out.println(one+ " * " + two + " = " + (one*two));
        System.out.println(one+ " / " + two + " = " + ((double)one/two));

    }
}
